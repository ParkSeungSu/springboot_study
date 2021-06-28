package seungsu.park.spring_blog.presentation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping(value = "/hello")
    public String index(Model model){
        model.addAttribute("name", "Spring Blog From Seungsu");
        return "hello";
    }
}
