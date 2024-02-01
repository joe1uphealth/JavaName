package com.example.demo.repositories;

import com.example.demo.entities.NameStorage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NameRepository extends CrudRepository<NameStorage, Long> {

    List<NameStorage> findAllByFirstName(String firstName);
}
