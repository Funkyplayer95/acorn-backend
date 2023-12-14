package FinalProject.TagMatch.Service;

import FinalProject.TagMatch.DTO.UserDTO;
import FinalProject.TagMatch.Entity.User;
import FinalProject.TagMatch.Repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
@RequiredArgsConstructor
@Transactional
public class SideService {

    private final UserRepository userRepository;

//    public String getNick(String email){
//        User user = userRepository.findByEmail(email).orElseThrow(EntityNotFoundException::new);
//        UserDTO sideDTO = new UserDTO();
//        sideDTO.setNickname(user.getNickname());
//
//        return sideDTO.getNickname();
//    }

    public List<UserDTO> userinfo(){
        List<User> UU  = userRepository.findAll();
        List<UserDTO> DT = new ArrayList<UserDTO>();

        for ( User en : UU) {
            UserDTO DTList = new UserDTO(
                    en.getUsernumber(),
                    en.getEmail(),
                    en.getNickname(),
                    en.getAge(),
                    en.getGender()
            );
            DT.add(DTList);
        }
        return DT;
    }


}
