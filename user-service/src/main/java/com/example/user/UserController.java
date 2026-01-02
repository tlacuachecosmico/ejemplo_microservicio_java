
package com.example.user;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping("/users")
    public String users() {
        return "Listado de usuarios";
    }
}
