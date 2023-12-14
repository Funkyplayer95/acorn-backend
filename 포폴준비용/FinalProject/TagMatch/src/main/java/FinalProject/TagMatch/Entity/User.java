package FinalProject.TagMatch.Entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

 @Id
 private int usernumber;

 private String email;
 private String nickname;
 private int age;
 private String gender;


}
