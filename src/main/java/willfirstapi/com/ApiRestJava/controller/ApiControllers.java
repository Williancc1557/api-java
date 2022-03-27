package willfirstapi.com.ApiRestJava.controller;

import org.springframework.web.bind.annotation.*;
import willfirstapi.com.ApiRestJava.entities.User;
import willfirstapi.com.ApiRestJava.provider.EncryptPassword;

@RestController
public class ApiControllers {
    @GetMapping(value = "/hash")
    public static String hashPassword(@RequestParam(value = "password") String password) {
        return EncryptPassword.hash(password);
    }

    @GetMapping(value = "/verifyhash")
    public static boolean verifyHash(
            @RequestParam(value = "password") String password,
            @RequestParam(value = "hash") String hash) {
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
