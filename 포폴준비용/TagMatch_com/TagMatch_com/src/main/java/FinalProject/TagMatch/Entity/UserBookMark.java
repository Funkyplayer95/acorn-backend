package FinalProject.TagMatch.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "USER-BOOKMARK")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserBookMark {
    @Id
    @Column(name="BOOKMARKNUMBER")
    private int BookMarkNum;

    @Column(name="userId")
    private long userId;
    private String BookMark;
    private String MarkDate;
    private int Priority;
}
