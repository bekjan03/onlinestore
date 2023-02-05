package kg.mega.OnlineStore.services;

import kg.mega.OnlineStore.models.Account;
import kg.mega.OnlineStore.models.Users;

import java.time.LocalDateTime;
import java.util.List;

public interface AccountService {
    Account saveAccount(Account account);
    Account findById(Long accountId);
//    List<Account> findActiveByUserId(Long userId);
    Account deactivate (Long id);
}
