package willfirstapi.com.ApiRestJava.controller;

import org.springframework.web.bind.annotation.*;
import willfirstapi.com.ApiRestJava.entities.User;
import willfirstapi.com.ApiRestJava.provider.EncryptPassword;

import java.util.logging.Logger;

@RestController
public class ApiControllers {
    private final Logger logger = Logger.getLogger("br.com.ApiController");

    @GetMapping(value = "/hash")
    public String hashPassword(@RequestParam(value = "password") String password) {
        logger.info("The router /hash has been executed");
        return EncryptPassword.hash(password);
    }

    @GetMapping(value = "/verifyhash")
    public boolean verifyHash(
            @RequestParam(value = "password") String password,
            @RequestParam(value = "hash") String hash) {
        logger.info("The router /verifyhash has been executed");
        return EncryptPassword.verifyHash(password, hash);
    }

    @PostMapping(value = "/user")
    public static User getPage(@RequestBody User user) {
        return user;
    }

    @GetMapping(value = "/name")
    public static String getMyName(@RequestParam(value = "name", defaultValue = "willian") String name) {
        String text = "hello %s";

        return String.format(text, name);
    }
}
