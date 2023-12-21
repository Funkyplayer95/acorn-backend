package FinalProject.TagMatch.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tag")
@ToString
public class Tag {

    @Id
    private String tagid;

    private String categoryid;
    private String subcatenumber;
    private String rtags;
    private int tagcount;
}
