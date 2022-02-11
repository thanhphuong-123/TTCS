package tran.tuananh.movie.Service.Impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tran.tuananh.movie.Repository.MovieRepository;
import tran.tuananh.movie.Service.MovieService;
import tran.tuananh.movie.Table.DTO.GenreDTO;
import tran.tuananh.movie.Table.DTO.MovieDTO;
import tran.tuananh.movie.Table.Model.Genre;
import tran.tuananh.movie.Table.Model.Movie;
import tran.tuananh.movie.Table.Response.GenerateResponse;
import tran.tuananh.movie.Table.Response.Response;
import tran.tuananh.movie.Table.Response.StatusCode;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class MovieServiceImpl implements MovieService {

    Logger logger = LogManager.getLogger(MovieServiceImpl.class);

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public Response getAll() {
        List<Movie> movieList = movieRepository.findAll();
        return GenerateResponse.generateSuccessResponse("SUCCESS GET MOVIE LIST", StatusCode.SUCCESS, movieList);
    }

    @Override
    public Response saveOrUpdate(MovieDTO dto) {
        LocalDateTime currentTime = LocalDateTime.now();
        try {
            if (dto.getId() == null) {
                dto.setCreatedDate(currentTime);
            } else {
                dto.setUpdatedDate(currentTime);
            }
            Movie movie = mapper.map(dto, Movie.class);
            movieRepository.save(movie);
            return GenerateResponse.generateSuccessResponse("SUCCESS SAVE MOVIE", StatusCode.SUCCESS, movie);
        } catch (Exception e) {
            logger.error(e);
            return GenerateResponse.generateErrorResponse(e.getLocalizedMessage(), StatusCode.ERROR);
        }
    }

    @Override
    public Response getById(MovieDTO dto) {
        try {
            if (dto.getId() == null) {
                return GenerateResponse.generateErrorResponse("Do not exist movie with id: " + dto.getId(),
                        StatusCode.ERROR);
            }
            Optional<Movie> optionalMovie = movieRepository.findById(dto.getId());
            if (optionalMovie.isPresent()) {
                Movie movie = optionalMovie.get();
                return GenerateResponse.generateSuccessResponse("SUCCESS FOUND MOVIE", StatusCode.SUCCESS, movie);
            }
            return GenerateResponse.generateErrorResponse("Do not exist movie with id: ", StatusCode.ERROR);
        } catch (Exception e) {
            logger.error(e);
            return GenerateResponse.generateErrorResponse(e.getLocalizedMessage(), StatusCode.ERROR);
        }
    }

    @Override
    public Response delete(MovieDTO dto) {
        try {
            if (dto.getId() == null) {
                return GenerateResponse.generateErrorResponse("Do not exist movie with id: " + dto.getId(),
                        StatusCode.ERROR);
            }
            Optional<Movie> optionalMovie = movieRepository.findById(dto.getId());
            if (optionalMovie.isPresent()) {
                Movie movie = optionalMovie.get();
                movie.setIsActive(false);
                movie.setIsDelete(true);
                movieRepository.save(movie);
                return GenerateResponse.generateSuccessResponse("SUCCESS DELETED", StatusCode.SUCCESS, movie);
            }
            return GenerateResponse.generateErrorResponse("Do not exist movie with id: ", StatusCode.ERROR);
        } catch (Exception e) {
            logger.error(e);
            return GenerateResponse.generateErrorResponse(e.getLocalizedMessage(), StatusCode.ERROR);
        }
    }

    @Override
    public Response getMovieByGenre(GenreDTO dto) {
        Genre genre = mapper.map(dto, Genre.class);
        List<Movie> movieList = movieRepository.findAll();
        List<Movie> result = new ArrayList<>();
        for (Movie movie : movieList) {
            List<Genre> genreList = movie.getGenres();
            genreList.forEach(g -> {
                if (Boolean.TRUE.equals(g.getId().intValue() == genre.getId().intValue() && g.getIsActive()) &&
                        Boolean.FALSE.equals(g.getIsDelete())) {
                    result.add(movie);
                }
            });
        }
        if (result.isEmpty()) {
            return GenerateResponse.generateSuccessResponse("NO MOVIE WITH THIS GENRE", StatusCode.SUCCESS, result);
        }
        return GenerateResponse.generateSuccessResponse("SUCCESS GET MOVIE LIST BY GENRE", StatusCode.SUCCESS, result);
    }
}
