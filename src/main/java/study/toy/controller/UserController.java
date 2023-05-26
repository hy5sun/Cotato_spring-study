package study.toy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import study.toy.entity.User;
import study.toy.service.UserService;

@RequiredArgsConstructor
@Controller
@RequestMapping("/api/auth/")
public class UserController {
    private final UserService userService;

    // 회원가입
    @PostMapping("/signup")
    @ResponseStatus(HttpStatus.CREATED)
    public void signUp(@RequestBody User user) {
        userService.signUp(user);
    }
}
