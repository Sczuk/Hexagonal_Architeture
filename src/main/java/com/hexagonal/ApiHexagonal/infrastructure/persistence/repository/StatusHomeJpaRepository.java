package com.hexagonal.ApiHexagonal.infrastructure.persistence.repository;

import com.hexagonal.ApiHexagonal.domain.model.enums.StatusHome;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaStatusHomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StatusHomeJpaRepository  extends JpaRepository<JpaStatusHomeEntity,Integer> {


    Optional<JpaStatusHomeEntity> findByStatus(StatusHome status);
}
