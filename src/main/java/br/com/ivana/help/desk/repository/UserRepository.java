package br.com.ivana.help.desk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.ivana.help.desk.entity.User;

public interface UserRepository extends MongoRepository<User,String>{

	User findByEmail(String email);
	
}
