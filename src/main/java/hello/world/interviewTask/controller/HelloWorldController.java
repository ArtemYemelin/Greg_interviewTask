package hello.world.interviewTask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class HelloWorldController {

    @GetMapping("/")
    public String greeting(Map<String, Object> model) {
        return "helloworld";
    }
}
