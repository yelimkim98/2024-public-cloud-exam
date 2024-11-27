package naver.kiel0103.publiccloudexam2024.presentation;

import lombok.RequiredArgsConstructor;
import naver.kiel0103.publiccloudexam2024.application.UserService;
import naver.kiel0103.publiccloudexam2024.application.dto.UserResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<UserResult>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }
}
