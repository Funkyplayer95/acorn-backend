package FinalProject.TagMatch.Service;

import FinalProject.TagMatch.DTO.SearchhistoryDto;
import FinalProject.TagMatch.Entity.User;
import FinalProject.TagMatch.Entity.UserDetail;
import FinalProject.TagMatch.Repository.SearchhistoryRepository;
import FinalProject.TagMatch.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import  jakarta.persistence.EntityNotFoundException;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class MypageService {
    private final UserRepository userRepository;
    private final SearchhistoryRepository searchhistoryRepository;

    public Long getId(String name){
        User user = userRepository.findByName(name).orElseThrow(EntityNotFoundException::new);
        Long userID = user.getUserId();

        return userID;
    }

    public List<SearchhistoryDto> getSearchList(Long userID){
        List<UserDetail> userSearchList = searchhistoryRepository.findByUserId(userID);
        List<SearchhistoryDto> searchListDto = new ArrayList<>();

        for(UserDetail us: userSearchList){
            SearchhistoryDto sDto = new SearchhistoryDto(
                    us.getLastSearch(),
                    us.getSearchDate()
                    );
            searchListDto.add(sDto);
        }
        System.out.println(searchListDto);
        return searchListDto;
    }

}
