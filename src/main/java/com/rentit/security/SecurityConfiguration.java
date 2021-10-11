package com.rentit.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.rentit.controller.admin.restController.AdminWebController;
import com.rentit.controller.company.restController.CompanyWebController;
import com.rentit.entity.Admin;
import com.rentit.entity.Company;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter
{
	@Autowired
	AdminWebController adminWebController;
	
	@Autowired
	CompanyWebController companyWebController;
	
	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder auth)
			throws Exception
	{
			List<Admin> list = adminWebController.getAllAdminsList();
		
		for (Admin admin : list) {
			auth.inMemoryAuthentication().withUser(admin.getUserName()).password(admin.getPassword())
			.roles("ADMIN");
		}
		
		List<Company> companiesList = companyWebController.getCompanies();
		
		for (Company company : companiesList) {
			auth.inMemoryAuthentication().withUser(company.getName()).password(company.getPassword())
			.roles("USER");
		}
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/adminDisplay", "/**todo/**").access("hasRole('ADMIN')")
		.antMatchers("/companyDisp", "/**todo/**").access("hasRole('USER')")
        .anyRequest().authenticated()
        .and()
        .formLogin().permitAll().loginPage("/adminlogin")
        .and()
        .logout().permitAll();
		
		http.csrf().disable();
	}
}


























