package com.fakestore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // Thymeleaf will look for index.html in templates/
    }

    // Vulnerable search endpoint (Reflected XSS)
    @GetMapping("/search")
    @ResponseBody
    public String search(@RequestParam String query) {
        return "<html><body><h1>Search Results</h1><p>You searched for: <strong>" + query + "</strong></p></body></html>";
    }
}
