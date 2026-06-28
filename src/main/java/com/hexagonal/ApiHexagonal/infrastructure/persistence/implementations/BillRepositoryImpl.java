package com.hexagonal.ApiHexagonal.infrastructure.persistence.implementations;

import com.hexagonal.ApiHexagonal.domain.model.BillHouse;
import com.hexagonal.ApiHexagonal.domain.repository.BillHouseRepository;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaBillsHouseEntity;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.exception.NotFoundBillException;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.mapper.BillsMapper;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.repository.BillsHouseJpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class BillRepositoryImpl implements BillHouseRepository {

    private BillsHouseJpaRepository repository;
    private BillsMapper mapper;


    @Override
    public BillHouse save(BillHouse billHouse) {
        repository.save(mapper.toEntity(billHouse));
        return billHouse;
    }

    @Override
    public BillHouse findByid(int id) {
        return mapper.toDomain(repository
                .findById(id)
                .orElseThrow(()->new NotFoundBillException("Bill with "+id+" id not found"))
        );
    }

    @Override
    public List<BillHouse> findAllByIdHome(UUID idHome, int page, int size) {
        //exception
        Pageable pageable = PageRequest.of(page,size);
        Page<JpaBillsHouseEntity> entityPage = repository.findAllByHomeId(idHome, pageable);

        return entityPage.getContent()
                .stream()
                .map(bills -> mapper.toDomain(bills))
                .toList();
    }


}
