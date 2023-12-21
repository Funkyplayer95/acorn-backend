package FinalProject.TagMatch.Controller;

import FinalProject.TagMatch.Service.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
public class MainController {


    @Autowired
    public final TagService tagService;

    // 첫 입장 페이지
    @GetMapping("/enterpage")//url
    public String enterPage(Model model) {
        return "enterpage";//html이름
    }
    
    //메인페이지 이동 함수
    @GetMapping("/mainpage")
    public String mainPage(Model model, String tagid){
        model.addAttribute("tagrank",tagService.taginfo(tagid));
        return "mainpage"; //html이름
    }

    @GetMapping("/search") //@RequestParam = form action될때 넘어가는 이름
    public String search(@RequestParam("tagname") String keyword, Model model){
        return "tagpage";
    }


//    @GetMapping("/test")
//    public String testpage(){
//        System.out.println(sideService.userinfo());
//        return "mainpage";
//    }

}

