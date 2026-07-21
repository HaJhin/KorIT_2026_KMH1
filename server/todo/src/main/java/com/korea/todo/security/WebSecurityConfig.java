package com.korea.todo.security;

import java.util.List;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity // 시큐리티 웹 보안 기능 활성화
@RequiredArgsConstructor
public class WebSecurityConfig {
	private final JwTAuthenticationFilter jwTAuthenticationFilter;
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		http
			.cors(cors -> cors.configurationSource(corsConfigurationSource()))
			// csrf : 사용자의 인증 정볼르 악용하여 원하지 않는 요청을 보내게 만드는 공격에 대한 보호 기능
			.csrf(csrf -> csrf.disable())
			// httpBasic 인증 비활성화 : jwt 방식으로 인증하기 때문에 basic 인증을 하지 않는다.
			.httpBasic(httpBasic -> httpBasic.disable())
			.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
			// URL에 따라 인증없이 접근할 수 있는 곳, 인증을 해야 접근할 수 있는 곳
			.authorizeHttpRequests(auth -> auth.requestMatchers("/","/auth/**").permitAll().anyRequest().authenticated())
			// JWT 인증 필터를 시큐리티 체인에 추가한다.
			// addFIlterBefore(A,B) : A필터를 B필터보다 먼저 실행한다.
			.addFilterBefore(jwTAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
			
		return http.build();
	}
	
	// 서블릿 필터 자동등록 막기
	// JwtAuthenticationFilter가 @Component이므로 스프린 bean으로 등록되어있다.
	// 하지만 Filter타입의 bean을 컨테이너의 일반 Filter로도 자동등록될 수 있다.
	@Bean
	public FilterRegistrationBean<JwTAuthenticationFilter> jwtAuthenticationFilterRegistration(
			JwTAuthenticationFilter filter) {
		FilterRegistrationBean<JwTAuthenticationFilter> registration =
					new FilterRegistrationBean<>(filter);
		
		//일반 필터로 자동 등록되는 것을 막는다.
		registration.setEnabled(false);
		return registration;
	}
	
	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		// CORS 정책을 저장하는 객체 생성
		CorsConfiguration configuration = new CorsConfiguration();
		
		// 요청을 허용할 Origin을 설정
		configuration.setAllowedOrigins(List.of("http://localhost:3000"));
		configuration.setAllowedMethods(List.of("GET","POST","PUT","DELETE","OPTIONS"));
		configuration.setAllowedHeaders(List.of("*"));
		configuration.setAllowCredentials(true);
		
		// URL 경로별로 CORS 설정을 등록하기 위한 객체
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		
		source.registerCorsConfiguration("/**", configuration);
		
		return source;
	}
	
} // class ed
