package app.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomepageController {

    @RequestMapping("/")
    public String index() {
        return "Hello world!";
    }

}