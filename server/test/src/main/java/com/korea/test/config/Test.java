package com.korea.test.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Test implements WebMvcConfigurer {
	// WebMvcConfigurer : Spring MVC의 기본설정을 변경할 수 있는 인터페이스
	
	// addCorsMappings() : 스프링부트가 시작될 때 이 메서드를 호출한다.
	// registry : CORS 설정을 등록하는 객체
	
	@Override
	public void addCorsMappings(CorsRegistry registry) { // 2. 메서드 이름(s 추가) 및 매개변수 오타 수정
        registry.addMapping("/**") // 3. 모든 경로(URL)에 대해 CORS 설정을 적용한다.
                .allowedOrigins("http://localhost:5500")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // 허용할 HTTP 메서드들 명시
                .allowedHeaders("*") // 허용할 헤더 정보 명시
        		.allowCredentials(true) // 쿠키나 인증 정보를 포함한 요청 정보 허용
        		.maxAge(3600); // 브라우저가 서버로부터 받은 응답을 일정 시간동안 저장
    }
}
