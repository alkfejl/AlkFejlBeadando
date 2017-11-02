package app.service;

import app.model.User;
import app.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
@Data
public class UserService {
    @Autowired
    private UserRepository userRepository;

    private User user;

    public User register(User user) {
        this.user = userRepository.save(user);
        return user;
    }

    public boolean isLoggedIn() {
        return user != null;
    }

    public User getUser() {
        return user;
    }
}
