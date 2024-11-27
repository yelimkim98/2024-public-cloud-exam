package naver.kiel0103.publiccloudexam2024.application;

import lombok.RequiredArgsConstructor;
import naver.kiel0103.publiccloudexam2024.application.dto.UserResult;
import naver.kiel0103.publiccloudexam2024.domain.User;
import naver.kiel0103.publiccloudexam2024.domain.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<UserResult> getAllUsers() {
        return userRepository.findAll().stream()
                .map(user -> UserResult.builder()
                        .id(user.getId())
                        .name(user.getName())
                        .build())
                .toList();
    }
}
