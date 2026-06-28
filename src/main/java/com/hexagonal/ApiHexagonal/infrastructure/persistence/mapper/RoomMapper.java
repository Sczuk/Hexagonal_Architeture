package com.hexagonal.ApiHexagonal.infrastructure.persistence.mapper;

import com.hexagonal.ApiHexagonal.domain.model.Rooms;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaRoomEntity;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class RoomMapper {

    public JpaRoomEntity toEntity(Rooms domain){

        JpaRoomEntity roomEntity = new JpaRoomEntity();

        roomEntity.setId(domain.getId());
        roomEntity.setName(domain.getName());

        return roomEntity;

    }

    public Rooms toDomain(JpaRoomEntity entity){

        Rooms domain = new Rooms();

        domain.setId(entity.getId());
        domain.setName(entity.getName());

        return domain;
    }

}
