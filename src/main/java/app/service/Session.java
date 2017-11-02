package app.service;

import app.model.User;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Data
@Service
@SessionScope
public class Session {
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}