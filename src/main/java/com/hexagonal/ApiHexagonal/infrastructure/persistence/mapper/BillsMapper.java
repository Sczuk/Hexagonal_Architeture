package com.hexagonal.ApiHexagonal.infrastructure.persistence.mapper;

import com.hexagonal.ApiHexagonal.domain.model.BillHouse;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaBillsHouseEntity;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class BillsMapper {

    public JpaBillsHouseEntity toEntity(BillHouse domain){

        JpaBillsHouseEntity billsEntity = new JpaBillsHouseEntity();
        billsEntity.setId(domain.getId());
        billsEntity.setDate(domain.getDate());
        billsEntity.setLightBill(domain.getLightBill());
        billsEntity.setInternetBill(domain.getInternetBill());
        billsEntity.setWaterBill(domain.getWaterBill());
        billsEntity.setRent(domain.getRent());
        billsEntity.setGroceries(domain.getGroceries());

        return billsEntity;

    }

    public BillHouse toDomain(JpaBillsHouseEntity entity){

        BillHouse domain = new BillHouse();
        domain.setId(entity.getId());
        domain.setDate(entity.getDate());
        domain.setLightBill(entity.getLightBill());
        domain.setInternetBill(entity.getInternetBill());
        domain.setWaterBill(entity.getWaterBill());
        domain.setRent(entity.getRent());
        domain.setGroceries(entity.getGroceries());

        return domain;
    }

}
