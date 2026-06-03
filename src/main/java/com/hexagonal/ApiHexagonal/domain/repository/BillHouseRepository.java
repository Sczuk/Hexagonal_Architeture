package com.hexagonal.ApiHexagonal.domain.repository;

import com.hexagonal.ApiHexagonal.domain.model.BillHouse;

public interface BillHouseRepository {

    BillHouse save(BillHouse billHouse);

    BillHouse findByid(int id);

}
