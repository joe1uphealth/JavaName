package com.example.demo.services;

import com.example.demo.entities.NameStorage;
import com.example.demo.repositories.NameRepository;
import com.example.demo.requests.Name;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NameService {

    @Autowired
    NameRepository nameRepository;

    Logger logger = LoggerFactory.getLogger(NameService.class);

    public Name capitializeName(Name name) {
        logger.info("here is the first name " + name.getFirstName());
        logger.info("here is the last name " + name.getLastName());

        name.setFirstName(name.getFirstName().toUpperCase());
        name.setLastName(name.getLastName().toUpperCase());

        NameStorage nameStorage = new NameStorage();
        nameStorage.setFirstName(name.getFirstName());
        nameStorage.setLastName(name.getLastName());

        nameRepository.save(nameStorage);

        return name;
    }

    public List<Name> findAllJoes() {
        List<NameStorage> names = nameRepository.findAllByFirstName("JOE");

        return names.stream().map(nameStorage ->
                new Name(nameStorage.getFirstName(), nameStorage.getLastName())).collect(Collectors.toList());

    }

}
