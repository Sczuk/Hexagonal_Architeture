package com.hexagonal.ApiHexagonal.domain.repository;

import com.hexagonal.ApiHexagonal.domain.model.User;

import java.util.UUID;

public interface UserRepository {

    User save(User user);

    User findById(UUID id);

    User findByCpf(String cpf);

}
