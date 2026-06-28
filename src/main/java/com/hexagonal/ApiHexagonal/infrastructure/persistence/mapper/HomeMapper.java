package com.hexagonal.ApiHexagonal.infrastructure.persistence.mapper;

import com.hexagonal.ApiHexagonal.domain.model.BillHouse;
import com.hexagonal.ApiHexagonal.domain.model.Home;
import com.hexagonal.ApiHexagonal.domain.model.Rooms;
import com.hexagonal.ApiHexagonal.domain.model.enums.StatusHome;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaBillsHouseEntity;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaHomeEntity;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaRoomEntity;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaStatusHomeEntity;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.repository.StatusHomeJpaRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@NoArgsConstructor
public class HomeMapper {

    @Autowired
    private StatusHomeJpaRepository statusHomeRepository;

    @Autowired
    private AddressMapper addressMapper;

    @Autowired
    private BillsMapper billsMapper;

    @Autowired
    private  RoomMapper roomMapper;

    public JpaHomeEntity toEntity(Home home){

        JpaHomeEntity homeEntity = new JpaHomeEntity();
        homeEntity.setId(home.getId());
        homeEntity.setStatusHome(this.convertStatusHomeEnumEntity(home));
        homeEntity.setAddress(addressMapper.toEntity(home.getAddress()));

        List<JpaRoomEntity> roomEntity = home.getRooms()
                .stream()
                .map(room -> {
                    JpaRoomEntity jpaRoomEntity = roomMapper.toEntity(room);
                    jpaRoomEntity.setHome(homeEntity);
                    return jpaRoomEntity;
                }).toList();

        List<JpaBillsHouseEntity> billsEntity = home.getBills()
                .stream()
                .map(billHouse -> {
                    JpaBillsHouseEntity jpaBillsHouse = billsMapper.toEntity(billHouse);
                    jpaBillsHouse.setHome(homeEntity);
                    return jpaBillsHouse;
                }).toList();

        homeEntity.setBills(billsEntity);
        homeEntity.setRooms(roomEntity);

        return homeEntity;
    }

    public JpaHomeEntity toEntityReferences(Home home){
        JpaHomeEntity entity = new JpaHomeEntity();

        entity.setId(home.getId());

        return entity;
    }

    public Home toDomain(JpaHomeEntity entity){
        Home domain = new Home();

        domain.setId(entity.getId());
        domain.setStatusHome(entity.getStatusHome().getStatus());
        domain.setAddress(addressMapper.toDomain(entity.getAddress()));
        domain.setRooms(entity.getRooms().stream().map(room -> roomMapper.toDomain(room)).toList());
        domain.setBills(entity.getBills().stream().map(bill -> billsMapper.toDomain(bill)).toList());

        return domain;
    }

    private JpaStatusHomeEntity convertStatusHomeEnumEntity(Home home){
        return statusHomeRepository.findByStatus(home.getStatusHome()).orElseThrow();
    }

}
