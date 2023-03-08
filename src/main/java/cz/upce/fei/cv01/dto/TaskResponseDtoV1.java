package cz.upce.fei.cv01.dto;

import cz.upce.fei.cv01.domain.AppUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
@NoArgsConstructor
@Data
@AllArgsConstructor
public class TaskResponseDtoV1 {

    private Long id;
    private String title;
    private String description;
    private LocalDateTime creationDate;
    private LocalDateTime updateDate;
}
