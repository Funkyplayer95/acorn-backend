package FinalProject.TagMatch.Controller;

import FinalProject.TagMatch.Service.ContentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class ContentsController {

    @Autowired
    private final ContentsService contentsService;

    @GetMapping("/rankpage")
    public String tagRankPage(@RequestParam(name = "days", defaultValue = "7") int radioValue,
                              @RequestParam(name = "platform", defaultValue = "i") List<String> checkboxValue,
                              Model model) {

        String[] getGtags = contentsService.getPlatformRank(radioValue, checkboxValue);
        Map<String,Integer> map = contentsService.gTagCount(getGtags);
        Map<String,Integer> sortMap = contentsService.sortByValueDesc(map);
        model.addAttribute("platformtags",sortMap.entrySet());


        return "rankpage";
    }

}

