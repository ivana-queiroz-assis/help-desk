package br.com.ivana.help.desk.service;

import java.util.Optional;

import org.springframework.data.domain.Page;

import br.com.ivana.help.desk.entity.User;

public interface UserService {

	User findByEmail(String email);
	
	User createOrUpdate(User user);
	
	Optional<User> findById(String id);
	
	void delete(String id);
	
	Page<User> findAll(int page, int count);
	
	
}

