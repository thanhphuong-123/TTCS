package tran.tuananh.movie.Table.DTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
public class CountryDTO {

    private String id;
    private String name;
    private Boolean isActive;
    private Boolean isDelete;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private String createdUserId;
    private String updatedUserId;
}
