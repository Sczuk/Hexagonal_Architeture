package com.hexagonal.ApiHexagonal.infrastructure.persistence.implementations;

import com.hexagonal.ApiHexagonal.domain.model.Rooms;
import com.hexagonal.ApiHexagonal.domain.repository.RoomRepository;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaRoomEntity;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.exception.NotFoundRoomException;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.mapper.RoomMapper;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.repository.RoomJpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class RoomRepositoryImpl implements RoomRepository {

    private RoomJpaRepository repository;
    private RoomMapper mapper;


    @Override
    public Rooms save(Rooms room) {
        repository.save(mapper.toEntity(room));
        return room;
    }

    @Override
    public Rooms findById(int id) {
        return mapper.toDomain(repository
                .findById(id)
                .orElseThrow(()->new NotFoundRoomException("room with "+id+" id not found"))
        );
    }

    @Override
    public List<Rooms> findAllByIdHome(UUID id, int page, int size) {
        Pageable pageable = PageRequest.of(page,size);
        Page<JpaRoomEntity> entityPage = repository.findAllByHomeId(id, pageable);

        return entityPage.getContent()
                .stream()
                .map(rooms -> mapper.toDomain(rooms))
                .toList();
    }

}
