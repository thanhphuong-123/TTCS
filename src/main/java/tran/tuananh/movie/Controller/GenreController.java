package tran.tuananh.movie.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tran.tuananh.movie.Service.GenreService;
import tran.tuananh.movie.Table.DTO.GenreDTO;
import tran.tuananh.movie.Table.Response.Response;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "api/v1/genre")
public class GenreController {

    @Autowired
    private GenreService genreService;

    @GetMapping(value = "/get-all")
    public Response getAll() {
        return genreService.getAll();
    }

    @PostMapping(value = "/save")
    public Response saveOrUpdate(@RequestBody GenreDTO dto) {
        return genreService.saveOrUpdate(dto);
    }

    @PostMapping(value = "/get-by-id")
    public Response getById(@RequestBody GenreDTO dto) {
        return genreService.getById(dto);
    }

    @PostMapping(value = "/delete")
    public Response delete(@RequestBody GenreDTO dto) {
        return genreService.delete(dto);
    }

}
