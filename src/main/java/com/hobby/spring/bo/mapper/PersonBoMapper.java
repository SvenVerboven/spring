package com.hobby.spring.bo.mapper;

import com.hobby.spring.bo.PersonBo;
import com.hobby.spring.entity.Person;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonBoMapper {
    List<PersonBo> convert(List<Person> persons);
}
