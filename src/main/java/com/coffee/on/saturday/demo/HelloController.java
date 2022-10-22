package com.coffee.on.saturday.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name="test", required = false, defaultValue = "BBdC1rl5sKY") String test, Model model) {
        model.addAttribute("test", test);
        return "hello";
    }
}