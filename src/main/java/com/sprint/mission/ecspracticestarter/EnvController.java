package com.sprint.mission.ecspracticestarter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 환경변수 확인용 컨트롤러
@RestController
public class EnvController {

  // 환경변수 SPRING_PROFILES_ACIVE 값(없으면 null)
  @Value("${SPRING_PROFILES_ACTIVE:#{null}}")
  private String springProfilesActive;

  @Value("${DB_HOST:#{null}}")
  private String dbHost;

  @Value("${DB_PASSWORD:#{null}}")
  private String dbPassword;

  @GetMapping("/env")
  public String showEnv() {
//    return String.format("""
//        SPRING_PROFILES_ACTIVE = %s
//        DB_HOST = %s
//        DB_PASSWORD = %s
//        """, springProfilesActive, dbHost, dbPassword);
    return "현재 실행 환경 : " + System.getenv("SPRING_PROFILES_ACTIVE");
  }

}
