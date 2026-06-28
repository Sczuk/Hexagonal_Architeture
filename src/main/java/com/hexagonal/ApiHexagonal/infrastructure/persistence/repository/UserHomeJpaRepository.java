package com.hexagonal.ApiHexagonal.infrastructure.persistence.repository;

import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaUserHomeEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface UserHomeJpaRepository extends JpaRepository<JpaUserHomeEntity,Integer> {

    List<JpaUserHomeEntity> findAllByUser_Id(UUID idUser);

}
