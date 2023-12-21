package FinalProject.TagMatch.Service;

import FinalProject.TagMatch.DTO.UserDto;
import FinalProject.TagMatch.Entity.User;
import FinalProject.TagMatch.Repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class SideService {

//    private final UserRepository userRepository;
//
//    public List<UserDto> userinfo(){
//        List<User> uu  = userRepository.findAll();
//        List<UserDto> dt = new ArrayList<UserDto>();
//
//        for ( User en : uu) {
//            UserDto DTList = new UserDto(
//                    en.getName(),
//                    en.getEmail(),
//                    en.getPicture(),
//                    en.
//            );
//            dt.add(DTList);
//        }
//        return dt;
//    }
//
//    public UserDto showName(String email){
//
//        User uu = userRepository.findByEmail(email);
//        UserDto dt = new UserDto();
//        if( uu != null)
//            dt.setName(uu.getName());
//
//        return dt;
//    }

}
