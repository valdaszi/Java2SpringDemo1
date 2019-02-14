package lt.bta.java2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hi")
public class Hello {

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/home")
    public String home() {
        return "redirect:/";
    }

    @GetMapping("/buddy")
    public ModelAndView secure(@RequestParam(required = false) String name) {
        ModelAndView mv = new ModelAndView("buddy");
        mv.addObject("name", name != null ? name : "Nobody");
        return mv;
    }
}
