package com.hobby.spring.service.dl;

import com.hobby.spring.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Repository
public class PersonDlService {

    @PersistenceContext
    private EntityManager entityManager;

    public Optional<List<Person>> findAll() {
        return Optional.ofNullable(entityManager.createQuery("SELECT p FROM Person p", Person.class).getResultList());
    }
}
