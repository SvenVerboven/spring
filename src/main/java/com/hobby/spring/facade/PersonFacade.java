package com.hobby.spring.facade;

import com.hobby.spring.bo.PersonBo;
import com.hobby.spring.service.bl.PersonBlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PersonFacade {

    private PersonBlService personBlService;

    @Autowired
    public PersonFacade(PersonBlService personBlService) {
        this.personBlService = personBlService;
    }

    public Optional<List<PersonBo>> findAll() {
        return personBlService.findAll();
    }
}
