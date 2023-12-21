package FinalProject.TagMatch.Controller;

import FinalProject.TagMatch.DTO.SessionUser;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * The type Login controller.
 */
@Controller
@RequiredArgsConstructor
public class LoginController {
    private final HttpSession httpSession;

    /**
     * Login string.
     *
     * @param model   the model
     * @param session the session
     * @return the string
     */
    @GetMapping("/")
    public String Login(Model model, HttpSession session) {

        // 세션에서 사용자 정보 꺼내기
        SessionUser user = (SessionUser) session.getAttribute("user");

        if (!user.getName().isEmpty()) {
            session.setAttribute("userName", user.getName());
            model.addAttribute("userName", user.getName());
        }
        return "sidebar";
    }

    /**
     * Go login string.
     *
     * @return the string
     */
    @GetMapping("/login")
    public static String goLogin() {
        return "login";
    }

    /**
     * Go signup string.
     *
     * @return the string
     */
    @GetMapping("/signup")
    public static String goSignup() {
        return "signup";
    }
}
