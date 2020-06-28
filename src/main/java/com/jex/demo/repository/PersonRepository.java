package com.jex.demo.repository;

import com.jex.demo.node.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

    Person findByName(String name);
}