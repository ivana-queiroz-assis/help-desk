package br.com.ivana.help.desk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.ivana.help.desk.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String>{

	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);
	
}
