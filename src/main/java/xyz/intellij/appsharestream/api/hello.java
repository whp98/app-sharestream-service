package xyz.intellij.appsharestream.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
