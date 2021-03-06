package seungsu.park.spring_blog.presentation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Service
public class HelloController {
    @RequestMapping({ "/" , "/hello" })
    public String index(Model model){
        model.addAttribute("name", "Spring Blog From Seungsu");
        return "hello";
    }
    @RequestMapping({"/blog"})
    public String blog(Model model) {
        return "blog";
    }
    @RequestMapping({"/post"})
    public String post(Model model){
        return "post";
    }
    
}
