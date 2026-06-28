package com.hexagonal.ApiHexagonal.infrastructure.persistence.repository;

import com.hexagonal.ApiHexagonal.domain.model.enums.UserHomeCondition;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaUserHomeConditionEntity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserHomeConditionJpaRepository extends JpaRepository<JpaUserHomeConditionEntity, Integer> {

    Optional<JpaUserHomeConditionEntity> findByCondition(UserHomeCondition condition);
}
