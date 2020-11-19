package com.hobby.spring.controller;

import com.hobby.spring.dto.PersonDto;
import com.hobby.spring.bo.PersonBo;
import com.hobby.spring.dto.mapper.PersonDtoMapper;
import com.hobby.spring.exception.DataNotFoundException;
import com.hobby.spring.facade.PersonFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private PersonFacade personFacade;
    private PersonDtoMapper personDtoMapper;

    @Autowired
    public PersonController(PersonFacade personFacade, PersonDtoMapper personDtoMapper) {
        this.personFacade = personFacade;
        this.personDtoMapper = personDtoMapper;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<PersonDto> findAll() {
        List<PersonBo> personBos = personFacade.findAll().orElseThrow(DataNotFoundException::new);
        return personDtoMapper.convert(personBos);
    }
}
