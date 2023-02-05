package kg.mega.OnlineStore.repository;

import kg.mega.OnlineStore.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<Users,Long> {
}
