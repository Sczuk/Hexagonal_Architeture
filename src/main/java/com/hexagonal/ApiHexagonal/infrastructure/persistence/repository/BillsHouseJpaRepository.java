package com.hexagonal.ApiHexagonal.infrastructure.persistence.repository;

import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaBillsHouseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BillsHouseJpaRepository extends JpaRepository<JpaBillsHouseEntity, Integer> {

    Page<JpaBillsHouseEntity> findAllByHomeId(UUID idHome, Pageable pageable);

}

