package com.hexagonal.ApiHexagonal.infrastructure.persistence.repository;

import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaHomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HomeJpaRepository extends JpaRepository<JpaHomeEntity, UUID> {
}
