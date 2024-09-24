package controller;

import org.springframework.stereotype.Controller;

@Controller
public class WelcomeController {

    @GetMapping("/get") public String home() {
        return "Welcome";
    }
}
