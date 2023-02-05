package kg.mega.OnlineStore.services.impl;

import kg.mega.OnlineStore.models.Account;
import kg.mega.OnlineStore.models.Users;
import kg.mega.OnlineStore.repository.AccountDAO;
import kg.mega.OnlineStore.services.AccountService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    private final AccountDAO accountRepo;

    public AccountServiceImpl(AccountDAO accountRepo) {
        this.accountRepo = accountRepo;
    }

    @Override
    public Account saveAccount(Account account) {
        return accountRepo.save(account);
    }

    @Override
    public Account findById(Long accountId) {
        return accountRepo.findById(accountId).get();
    }

//    @Override
//    public List<Account> findActiveByUserId(Long userId) {
////        return accountRepo.findAllByUserIdAndEndDateAfter(userId,LocalDateTime.now());
//        return accountRepo.findAllByUserIdAndIsActiveTrue(userId);
//    }

    @Override
    public Account deactivate(Long id) {
        Account account = findById(id);
        account.setEndDate(LocalDateTime.now());
        account.setActive(false);
        return accountRepo.saveAndFlush(account);
    }

}
