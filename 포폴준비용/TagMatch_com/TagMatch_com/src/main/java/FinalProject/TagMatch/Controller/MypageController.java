package FinalProject.TagMatch.Controller;

import FinalProject.TagMatch.DTO.SearchhistoryDto;
import FinalProject.TagMatch.Service.MypageService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MypageController {
    private final MypageService mypageService;

    @GetMapping("/mypage")
    public String myPage(Model model, HttpServletRequest req) {
        String userName = req.getSession().getAttribute("userName").toString();

        Long userId = mypageService.getId(userName);
        System.out.println(userName);

        List<SearchhistoryDto> searchhistoryList = mypageService.getSearchList(userId);

        model.addAttribute("searchhistoryList", searchhistoryList);
        return "mypage"; // HTML 파일 이름
    }
}

