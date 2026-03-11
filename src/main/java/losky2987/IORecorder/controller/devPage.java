package losky2987.IORecorder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import losky2987.IORecorder.pageMaker.pageMaker;

@RestController
public class devPage {
    @GetMapping("/")
    public String index() {
        return pageMaker.makeDefaultPage("test page maker");
    }
}
