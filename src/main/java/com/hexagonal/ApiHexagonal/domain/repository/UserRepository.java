package com.hexagonal.ApiHexagonal.domain.repository;

import com.hexagonal.ApiHexagonal.domain.model.User;

import java.util.List;
import java.util.UUID;

public interface UserRepository {

    User save(User user);

    User findById(UUID id);

    User findByCpf(String cpf);

    //List<User> findAllByIdHome(UUID idHome, int page, int size);

}
