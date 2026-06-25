package com.hexagonal.ApiHexagonal.domain.model;


import com.hexagonal.ApiHexagonal.domain.model.enums.Role;

import java.util.List;
import java.util.UUID;

public class User {

    private UUID id;

    private String name;

    private String cpf;

    private String password;

    private List<Home> homesOwner;

    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Home> getHomesOwner() {
        return homesOwner;
    }

    public void setHomesOwner(List<Home> homesOwner) {
        this.homesOwner = homesOwner;
    }
}
