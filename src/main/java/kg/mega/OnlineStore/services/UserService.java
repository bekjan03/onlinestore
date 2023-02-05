package kg.mega.OnlineStore.services;

import kg.mega.OnlineStore.models.Users;

import java.time.LocalDate;

public interface UserService {
    Users saveUser(Users users);
    Users findById (Long id);
    void deleteById (Long id);
}
