package com.hobby.spring.service.bl;

import com.hobby.spring.bo.PersonBo;
import com.hobby.spring.bo.mapper.PersonBoMapper;
import com.hobby.spring.entity.Person;
import com.hobby.spring.exception.DataNotFoundException;
import com.hobby.spring.service.dl.PersonDlService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonBlService {

    private PersonDlService personDlService;
    private PersonBoMapper personBoMapper;

    public PersonBlService(PersonDlService personDlService, PersonBoMapper personBoMapper) {
        this.personDlService = personDlService;
        this.personBoMapper = personBoMapper;
    }

    public Optional<List<PersonBo>> findAll() {
        List<Person> persons = personDlService.findAll().orElseThrow(DataNotFoundException::new);
        return Optional.ofNullable(personBoMapper.convert(persons));
    }
}
