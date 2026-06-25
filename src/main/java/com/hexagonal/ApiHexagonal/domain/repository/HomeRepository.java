package com.hexagonal.ApiHexagonal.domain.repository;

import com.hexagonal.ApiHexagonal.domain.model.BillHouse;
import com.hexagonal.ApiHexagonal.domain.model.Home;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaHomeEntity;

import java.util.UUID;

public interface HomeRepository {

    JpaHomeEntity save(Home home);

    Home findById(UUID id);

}
