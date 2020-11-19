package com.hobby.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonDto {
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
}
