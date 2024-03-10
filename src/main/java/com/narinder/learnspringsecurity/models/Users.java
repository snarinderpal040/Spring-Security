package com.narinder.learnspringsecurity.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Users {

    @Id
    private String username;

    private String password;

    private boolean enabled;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Authorities> authorities;

}
