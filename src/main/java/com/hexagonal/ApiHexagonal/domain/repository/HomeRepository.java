package com.hexagonal.ApiHexagonal.domain.repository;

import com.hexagonal.ApiHexagonal.domain.model.Home;

import java.util.UUID;

public interface HomeRepository {

    Home save(Home home);

    Home findById(UUID id);

}
