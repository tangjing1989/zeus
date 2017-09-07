package com.tangjing.project.repository;

import java.util.Collection;

import com.tangjing.project.model.Party;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PartyRepository extends CrudRepository<Party, Long> {
	
	Collection<Party> findAll();

}
