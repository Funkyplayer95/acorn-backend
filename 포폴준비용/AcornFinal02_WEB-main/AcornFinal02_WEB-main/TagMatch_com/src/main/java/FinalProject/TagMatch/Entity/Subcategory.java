package FinalProject.TagMatch.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "SUBCATEGORY")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Subcategory {
    @Id
    private int subcatenumber;
    private String subcatename;
    private String categoryid;
}
