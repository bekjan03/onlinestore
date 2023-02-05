package kg.mega.OnlineStore.controllers;

import io.swagger.annotations.ApiOperation;
import kg.mega.OnlineStore.models.Account;
import kg.mega.OnlineStore.services.AccountService;
import kg.mega.OnlineStore.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
@ApiOperation("Account API")
public class AccountController {
    private final AccountService accountService;
    private final UserService userService;

    public AccountController(AccountService accountService, UserService userService) {
        this.accountService = accountService;
        this.userService = userService;
    }
    @ApiOperation("Сохранение аккаунта пользовательв в БД.")
    @PostMapping("/save")
    public Account save(@RequestBody Account account){
        return accountService.saveAccount(account);
    }
    @ApiOperation("Возвращает аккаунт по ID.")
    @GetMapping("/accountById")
    public Account findById(@RequestParam Long accountId) {

        return accountService.findById(accountId);
//  RequestBody  }
//    @ApiOperation("Возвращает активный аккаунт по ID пользователя.")
//    @GetMapping("/activeByUser")
//    public List<Account> findActiveByUserId(@RequestParam Long userId) {
//       return accountService.findActiveByUserId(userId);
   }
    @ApiOperation("Деактивирует и возвращает аккаунт по ID.")
    @PutMapping("/deactivate")
    public Account deactivate(@RequestParam Long id){
        return accountService.deactivate(id);
    }

}
