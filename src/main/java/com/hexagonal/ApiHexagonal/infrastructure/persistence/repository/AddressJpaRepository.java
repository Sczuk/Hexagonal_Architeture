package com.hexagonal.ApiHexagonal.infrastructure.persistence.repository;

import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaAddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressJpaRepository extends JpaRepository<JpaAddressEntity, Integer> {

}
