package FinalProject.TagMatch.Controller;

import FinalProject.TagMatch.DTO.UserDTO;
import FinalProject.TagMatch.Service.SideService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class MainController {

    public final SideService sideService;

    // 첫 입장 페이지
    @GetMapping("/enterpage")//url
    public String enterPage(Model model) {
        return "enterpage";//html이름
    }
    
    //메인페이지 이동 함수
    @GetMapping("/mainpage") //url
    public String mainPage(Model model){
        return "mainpage"; //html이름
    }


    @GetMapping("/tagpage") //url
    public String tagPage(Model model){
        return "tagpage"; //html이름
    }

    @GetMapping("/test")
    public String testpage(){
        System.out.println(sideService.userinfo());
        return "mainpage";
    }
}

