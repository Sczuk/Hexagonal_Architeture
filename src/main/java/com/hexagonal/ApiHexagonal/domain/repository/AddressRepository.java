package com.hexagonal.ApiHexagonal.domain.repository;

import com.hexagonal.ApiHexagonal.domain.model.Address;

public interface AddressRepository {

    Address save(Address address);

    Address findById(int id);

}
