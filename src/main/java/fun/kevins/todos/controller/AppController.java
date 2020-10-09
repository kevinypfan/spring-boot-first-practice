package fun.kevins.todos.controller;

import fun.kevins.todos.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class AppController {
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("hello", "Kevins.fun"); // （變數名稱，變數值)
        return "hello";
    }

    @GetMapping("/form")
    public String form(Model model) {
        Person person = new Person(); // 將Person 實體化
        model.addAttribute("person", person);
        return "form"; // 導至form.html
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Person person, Model model) {
        model.addAttribute("person", person);
        return "add";
    }
}
