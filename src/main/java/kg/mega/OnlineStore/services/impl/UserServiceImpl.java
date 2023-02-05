package kg.mega.OnlineStore.services.impl;

import kg.mega.OnlineStore.models.Users;
import kg.mega.OnlineStore.repository.UserDAO;
import kg.mega.OnlineStore.services.UserService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserDAO userRepo;

    public UserServiceImpl(UserDAO userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public Users saveUser(Users user) {
        return userRepo.save(user);
    }

    @Override
    public Users findById(Long id) {
        return userRepo.findById(id).orElse(new Users());

    }

}
