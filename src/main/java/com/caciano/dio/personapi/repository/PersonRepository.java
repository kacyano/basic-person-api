package com.caciano.dio.personapi.repository;

import com.caciano.dio.personapi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
