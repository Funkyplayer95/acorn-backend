package FinalProject.TagMatch.Controller;

import FinalProject.TagMatch.Service.SideService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class SideController {

    @Autowired
    private final SideService sideService;

    @GetMapping("/sidebar")
    public String sidebar(Model model,HttpSession session){
        return "sidebar";
    }

    @GetMapping("/login")
    public static String goLogin(){
        return "login";
    }
    @GetMapping("/signup")
    public static String goSignup(){
        return "signup";
    }
}
