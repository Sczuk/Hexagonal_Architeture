package com.hexagonal.ApiHexagonal.infrastructure.persistence.repository;

import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaRoomEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoomJpaRepository extends JpaRepository<JpaRoomEntity, Integer> {

    Page<JpaRoomEntity> findAllByHomeId(UUID idHome, Pageable pageable);

}
