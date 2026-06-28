package com.hexagonal.ApiHexagonal.infrastructure.persistence.implementations;

import com.hexagonal.ApiHexagonal.domain.model.User;
import com.hexagonal.ApiHexagonal.domain.repository.UserRepository;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaUsersEntity;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.exception.NotFoundUserException;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.mapper.UserMapper;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.repository.UsersJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private UsersJpaRepository repository;

    @Autowired
    private UserMapper mapper;

    @Override
    public User save(User user) {
        repository.save(mapper.toEntity(user));
        return user;
    }

    @Override
    public User findById(UUID id) {
        return mapper.toDomain(repository.findById(id).orElseThrow(()->new NotFoundUserException("User by "+id+" id not found")));
    }

    @Override
    public User findByCpf(String cpf) {
        return mapper.toDomain(repository.findByCpf(cpf).orElseThrow(()-> new NotFoundUserException("User by "+cpf+" cpf not found")));
    }

//    @Override
//    public List<User> findAllByIdHome(UUID idHome, int page, int size) {
//        Pageable pageable = PageRequest.of(page,size);
//        //exception
//        Page<JpaUsersEntity> entityPage = repository.findAllByIdHome(idHome,pageable);
//
//        return entityPage.getContent()
//                .stream()
//                .map(users -> mapper.toDomain(users))
//                .toList();
//
//    }
}
