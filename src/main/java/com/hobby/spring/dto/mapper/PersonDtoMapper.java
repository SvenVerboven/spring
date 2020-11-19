package com.hobby.spring.dto.mapper;

import com.hobby.spring.bo.PersonBo;
import com.hobby.spring.dto.PersonDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonDtoMapper {
    List<PersonDto> convert (List<PersonBo> personBos);
}
