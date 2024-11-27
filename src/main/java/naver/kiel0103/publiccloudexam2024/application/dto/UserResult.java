package naver.kiel0103.publiccloudexam2024.application.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserResult {

    private Long id;
    private String name;
}
