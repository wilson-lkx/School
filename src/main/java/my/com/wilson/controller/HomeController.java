package my.com.wilson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

@Controller
@ApiIgnore
public class HomeController {

    @RequestMapping({"/","/home"})
    public String showHomePage() {
        return "static/index.html";
    }
}
