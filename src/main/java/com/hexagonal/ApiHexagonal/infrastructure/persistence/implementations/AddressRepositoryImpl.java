package com.hexagonal.ApiHexagonal.infrastructure.persistence.implementations;

import com.hexagonal.ApiHexagonal.domain.model.Address;
import com.hexagonal.ApiHexagonal.domain.repository.AddressRepository;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.exception.NotFoundAddressException;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.mapper.AddressMapper;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.repository.AddressJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AddressRepositoryImpl implements AddressRepository {

    private AddressJpaRepository repository;
    private AddressMapper mapper;


    @Override
    public Address save(Address address) {
        repository.save(mapper.toEntity(address));
        return address;
    }

    @Override
    public Address findById(int id) {
        return mapper.toDomain(repository
                .findById(id)
                .orElseThrow(()->new NotFoundAddressException("Address not found"))
        );
    }
}
