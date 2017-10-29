package hello.service;

import hello.model.User;
import hello.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserService userService;

    public List<User> findByEmail(String email) {
        return userService.findByEmail(email);
    }

}
