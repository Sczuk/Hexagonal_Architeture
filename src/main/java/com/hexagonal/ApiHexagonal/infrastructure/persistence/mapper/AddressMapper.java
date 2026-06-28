package com.hexagonal.ApiHexagonal.infrastructure.persistence.mapper;

import com.hexagonal.ApiHexagonal.domain.model.Address;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaAddressEntity;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaStateEntity;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.repository.StateJpaRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class AddressMapper {

    @Autowired
    private StateJpaRepository stateRepository;

    public JpaAddressEntity toEntity(Address domain){

        JpaAddressEntity addressEntity = new JpaAddressEntity();
        JpaStateEntity stateEntity = converterStateEnumEntity(domain);

        addressEntity.setId(domain.getId());
        addressEntity.setState(converterStateEnumEntity(domain));
        addressEntity.setCep(domain.getCep());
        addressEntity.setCity(domain.getCity());
        addressEntity.setNumber(domain.getNumber());
        addressEntity.setCountry(domain.getCountry());

        return addressEntity;

    }

    public Address toDomain(JpaAddressEntity entity){

        Address domain = new Address();

        domain.setId(entity.getId());
        domain.setState(entity.getState().getState());
        domain.setCep(entity.getCep());
        domain.setCity(entity.getCity());
        domain.setNumber(entity.getNumber());
        domain.setCountry(entity.getCountry());

        return domain;

    }


    private JpaStateEntity converterStateEnumEntity(Address domain){
        return stateRepository.findByState(domain.getState()).orElseThrow();
    }
}
