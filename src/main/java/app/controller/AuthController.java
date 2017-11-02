package app.controller;

import app.model.User;
import app.repository.UserRepository;
import app.service.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    Session session;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(@RequestBody User user) {
        Optional<User> dbUser =
                userRepository.findByUsernameAndPassword(user.getUsername(),
                        user.getPassword());

        if (dbUser.isPresent()) {
            session.setUser(dbUser.get());
            return "logged in as " + session.getUser().getRole().toString();
        } else {
            return "invalid username and/or password";
        }
    }

    @GetMapping("/isloggedin")
    public String isLoggedIn() {
        if (session.getUser() == null) {
            return "not logged in";
        } else {
            return session.getUser().toString();
        }
    }
}