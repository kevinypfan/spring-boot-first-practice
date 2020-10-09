package fun.kevins.todos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AppController {
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("hello", "Kevins.fun"); // （變數名稱，變數值)
        return "hello";
    }
}
