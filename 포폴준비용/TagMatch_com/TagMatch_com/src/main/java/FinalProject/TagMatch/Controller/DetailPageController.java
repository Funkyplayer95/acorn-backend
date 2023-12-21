package FinalProject.TagMatch.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DetailPageController {

    @GetMapping("/detail_page")
    public static String detailPage(Model model){
        return "detail_page";
    }
}
