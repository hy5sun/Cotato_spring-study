package study.toy.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import study.toy.entity.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<String> users = new ArrayList<>();
    @Transactional
    public List<String> signUp(User user) {
        User user1 = new User(user.getEmail(), user.getName(), user.getPassword());
        users.add(String.valueOf(user1));
        System.out.println(user1);
        return users;
    }
}
