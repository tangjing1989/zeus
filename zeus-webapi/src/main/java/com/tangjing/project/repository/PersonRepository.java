package com.tangjing.project.repository;

import java.util.Collection;

import com.tangjing.project.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
	
	Collection<Person> findAll();
	
	Person findByUsername(String username);

}
