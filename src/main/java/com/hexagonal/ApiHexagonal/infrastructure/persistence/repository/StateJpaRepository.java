package com.hexagonal.ApiHexagonal.infrastructure.persistence.repository;

import com.hexagonal.ApiHexagonal.domain.model.enums.State;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaStateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StateJpaRepository extends JpaRepository<JpaStateEntity,Integer> {

    Optional<JpaStateEntity> findByState(State state);
}
