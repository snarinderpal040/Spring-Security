package com.narinder.learnspringsecurity.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.narinder.learnspringsecurity.models.Authorities;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToOne;

public class UsersDto {

    private String username;

    @JsonIgnore
    private String password;

    private boolean enabled;

    private AuthoritiesDto authoritiesDto;
}
