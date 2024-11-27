package naver.kiel0103.publiccloudexam2024.presentation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

  @GetMapping("/health")
  public ResponseEntity<String> health() {
    return ResponseEntity.ok("healthy");
  }
}
