package io.pivotal.pal.tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class WelcomeController {

    private final String displayMessage;

    public WelcomeController( @Value("${welcome.message}") String displayMessage)
    {
        this.displayMessage = displayMessage;
    }

    @GetMapping("/")
    public String sayHello()
    {
        return "hello";
    }
}
