package FinalProject.TagMatch.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO {

    private int usernumber;

    private String email;
    private String nickname;
    private int age;
    private String gender;
}
