package com.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@EnableWebSecurity
@Configuration
public class DispatcherSecurity extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		UserBuilder user = User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication().withUser(user.username("admin").password("admin").roles("MANAGER", "EMPLOYEE"))
				.withUser(user.username("shan").password("shan").roles("EMPLOYEE"));
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		        .antMatchers("/").hasAnyRole("EMPLOYEE")
		        .antMatchers("/employee/**").hasAnyRole("EMPLOYEE")
		        .antMatchers("/manager/**").hasAnyRole("MANAGER").and().formLogin()
				.loginPage("/showFormLogin").loginProcessingUrl("/authenticateTheUser").permitAll().and().logout()
				.permitAll();
	}
}
