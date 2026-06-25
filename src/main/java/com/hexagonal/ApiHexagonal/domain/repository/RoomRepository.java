package com.hexagonal.ApiHexagonal.domain.repository;

import com.hexagonal.ApiHexagonal.domain.model.Rooms;

import java.util.List;
import java.util.UUID;

public interface RoomRepository {

    Rooms save(Rooms room);

    Rooms findById(int id);

    List<Rooms> findAllByIdHome(UUID id, int page, int size);
}
