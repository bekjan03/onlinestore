package kg.mega.OnlineStore.controllers;

import io.swagger.annotations.ApiOperation;
import kg.mega.OnlineStore.models.Account;
import kg.mega.OnlineStore.models.Users;
import kg.mega.OnlineStore.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
@PostMapping("/save")
    public Users save(@RequestBody Users users){
        return userService.saveUser(users);
    }

    @ApiOperation("Возвращает пользователя по ID.")
    @GetMapping("/userById")
    public Users findById(@RequestParam Long userId) {
        return userService.findById(userId);
    }
}
