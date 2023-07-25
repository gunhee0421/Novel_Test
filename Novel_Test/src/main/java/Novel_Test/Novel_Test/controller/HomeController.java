package Novel_Test.Novel_Test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String Home(){
        return "home";
    }
    @RequestMapping("/login.html")
    public String login(){
        return "login";
    }
    @RequestMapping("/makeid.html")
    public String makeid(){
        return "makeid";
    }
}
