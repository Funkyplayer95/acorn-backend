package FinalProject.TagMatch.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "contents")
@ToString
public class Contents {

    @Id
    int contentsnumber;
    String platformid;
    String writer;
    LocalDate date;
    int like;
    String gtags;
    int commments;
    String url;
    String content;
    LocalDate crawlingdate;

}
