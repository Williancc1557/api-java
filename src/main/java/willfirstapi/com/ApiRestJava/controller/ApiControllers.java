package willfirstapi.com.ApiRestJava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import willfirstapi.com.ApiRestJava.entities.User;

@RestController
public class ApiControllers {
    @GetMapping(value = "/")
    public User getPage() {
        return new User(1, "will", "cavalcanti", 17, "single");
    }
}
