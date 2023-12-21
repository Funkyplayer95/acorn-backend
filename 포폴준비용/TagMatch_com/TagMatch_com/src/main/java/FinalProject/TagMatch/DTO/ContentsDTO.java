package FinalProject.TagMatch.DTO;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ContentsDTO {

    private int contentsnumber;
    private String platformid;
    private String writer;
    private LocalDate date;
    private int like;
    private String gtags;
    private int commments;
    private String url;
    private String content;
    private LocalDate crawlingdate;
}
