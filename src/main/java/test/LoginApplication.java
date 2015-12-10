package test;
//package br.com.eicon;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.session.SessionRegistry;
//import org.springframework.security.core.session.SessionRegistryImpl;
//import org.springframework.security.web.authentication.logout.LogoutHandler;
//import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
//
//@SpringBootApplication
//@EnableWebSecurity
//// @EnableCircuitBreaker
////@EnableEurekaClient
//@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 30)
//public class LoginApplication extends WebSecurityConfigurerAdapter{
//
//	public static void main(String[] args) {
//		SpringApplication.run(LoginApplication.class, args);
//	}
//
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("user").password("123").roles("USER");
//
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.
//		authorizeRequests().
//		anyRequest().authenticated().
//		antMatchers("/expired").permitAll().
//		antMatchers("/saiu").permitAll().
//		and().
//		formLogin().defaultSuccessUrl("/").
//				and().
//				logout().
//				logoutUrl("/sair").
//				addLogoutHandler(logoutHandler()).
//				logoutSuccessUrl("/saiu").
//				and().
//				sessionManagement().
//				maximumSessions(1).
//				expiredUrl("/expired")
//				.maxSessionsPreventsLogin(true).sessionRegistry(sessionRegistry());
//
//	}
//	  @Bean
//	    public SessionRegistry sessionRegistry() {
//	        SessionRegistry sessionRegistry = new SessionRegistryImpl();
//	        return sessionRegistry;
//	    }
//	private LogoutHandler logoutHandler() {
//
//		return new LogoutHandler() {
//			@Override
//			public void logout(HttpServletRequest arg0, HttpServletResponse arg1, Authentication arg2) {
//				SecurityContextHolder.getContext().setAuthentication(null);
//				arg0.getSession(true).invalidate();
//				System.out.println("saindo");
//			}
//		};
//	}
//
//}
