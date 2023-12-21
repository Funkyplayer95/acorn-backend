package FinalProject.TagMatch.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import lombok.*;

@Entity
@Table(name = "USERDETAIL")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDetail {
    @Id
    private int HistoryNumber;

    @Column(name="user_number")
    private int userNumber;

    private String LastSearch;
    private String SearchDate;
}
