package FinalProject.TagMatch.Controller;

import FinalProject.TagMatch.DTO.SessionUser;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {
    private final HttpSession httpSession;

    @GetMapping("/")
    public String Login(Model model, HttpSession session) {

            // 세션에서 사용자 정보 꺼내기
            SessionUser user = (SessionUser) session.getAttribute("user");

            if (!user.getName().isEmpty()) {
                session.setAttribute("userName", user.getName());
                model.addAttribute("userName",user.getName());
            }
        return "sidebar";
        }
}
