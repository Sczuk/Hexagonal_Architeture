package com.hexagonal.ApiHexagonal.infrastructure.persistence.repository;

import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaUsersEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UsersJpaRepository extends JpaRepository<JpaUsersEntity, UUID> {

    Optional<JpaUsersEntity> findByCpf(String cpf);

    Page<JpaUsersEntity> findAllByHomes_Id(UUID idHome, Pageable pageable);

    UUID id(UUID id);
}
