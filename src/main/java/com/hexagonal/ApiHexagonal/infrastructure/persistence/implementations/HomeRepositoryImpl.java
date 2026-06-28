package com.hexagonal.ApiHexagonal.infrastructure.persistence.implementations;

import com.hexagonal.ApiHexagonal.domain.model.Home;
import com.hexagonal.ApiHexagonal.domain.repository.HomeRepository;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaHomeEntity;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.exception.NotFoundHomeException;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.mapper.HomeMapper;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.repository.HomeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class HomeRepositoryImpl implements HomeRepository {

    @Autowired
    private HomeJpaRepository jpaRepository;

    @Autowired
    private HomeMapper homeMapper;


    @Override
    public JpaHomeEntity save(Home home) {
        return jpaRepository.save(homeMapper.toEntity(home));
    }

    @Override
    public Home findById(UUID id) {
        return homeMapper.toDomain(jpaRepository
                .findById(id)
                .orElseThrow(()->new NotFoundHomeException("home with "+id+" id not found"))
        );
    }
}
