package kg.mega.OnlineStore.repository;

import kg.mega.OnlineStore.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDAO extends JpaRepository<Account,Long> {
    Account findByEmail(String email);

}
