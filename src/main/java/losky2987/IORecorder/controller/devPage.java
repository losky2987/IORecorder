package losky2987.IORecorder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class devPage {
    @GetMapping("/")
    public String index() {
        return "hello world";
    }
}
