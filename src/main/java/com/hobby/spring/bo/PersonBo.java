package com.hobby.spring.bo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonBo {
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
}
