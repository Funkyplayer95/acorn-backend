package FinalProject.TagMatch.DTO;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TagDTO {
    private String tagid;
    private String categoryid;
    private int subcatenumber;
    private String tags;
    private int tagcount;

    public TagDTO (String tagid, int tagcount){
        this.tagid= tagid;
        this.tagcount= tagcount;
    }
}
