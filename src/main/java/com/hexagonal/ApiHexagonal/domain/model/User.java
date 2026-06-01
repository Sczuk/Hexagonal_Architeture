package com.hexagonal.ApiHexagonal.domain.model;


import java.util.List;
import java.util.UUID;

public class User {

    private UUID id;

    private String name;

    private String cpf;

    private String password;

    private List<Home> homes;
}
