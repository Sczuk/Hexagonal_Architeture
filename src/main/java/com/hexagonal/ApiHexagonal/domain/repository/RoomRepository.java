package com.hexagonal.ApiHexagonal.domain.repository;

import com.hexagonal.ApiHexagonal.domain.model.Rooms;

import java.util.List;

public interface RoomRepository {

    Rooms save(Rooms room);

    Rooms findById(int id);

    List<Rooms> findAll();
}
