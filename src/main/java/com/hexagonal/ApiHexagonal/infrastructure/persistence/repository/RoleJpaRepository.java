package com.hexagonal.ApiHexagonal.infrastructure.persistence.repository;

import com.hexagonal.ApiHexagonal.domain.model.enums.Role;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface RoleJpaRepository extends JpaRepository<JpaRoleEntity, Integer> {

    Optional<JpaRoleEntity> findByRole(Role role);
}
