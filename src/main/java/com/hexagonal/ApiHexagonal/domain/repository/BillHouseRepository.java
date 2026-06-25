package com.hexagonal.ApiHexagonal.domain.repository;

import com.hexagonal.ApiHexagonal.domain.model.BillHouse;

import java.util.List;
import java.util.UUID;

public interface BillHouseRepository {

    BillHouse save(BillHouse billHouse);

    BillHouse findByid(int id);

    List<BillHouse> findAllByIdHome(UUID idHome, int page, int size);
}
