package FinalProject.TagMatch.Controller;

import FinalProject.TagMatch.Service.TagService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class TagController {
    private final TagService TagService;

    @GetMapping("/tagpage") //url
    public String tagPage(@RequestParam(name = "tagname", defaultValue = "") String tagname, Model model) {
        if (!tagname.isEmpty()) {
            model.addAttribute("Ctagname", tagname);
            model.addAttribute("Rtags", TagService.getRTag(tagname));
        }
        return "tagpage"; //html이름
    }

    @GetMapping("/rankpage")
    public String tagRankPage(@RequestParam(name = "weekandmonth") String choiceday,
                              @RequestParam(name = "platform") String choiceplatform,
                              Model model) {


        if(choiceday == "week") {

        }
        else if (choiceday == "month") {
            
        }
        return "rankpage";
    }
}


