package com.hexagonal.ApiHexagonal.infrastructure.persistence.mapper;

import com.hexagonal.ApiHexagonal.domain.model.User;
import com.hexagonal.ApiHexagonal.domain.model.UserHome;
import com.hexagonal.ApiHexagonal.domain.model.enums.Role;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaRoleEntity;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaUserHomeEntity;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaUsersEntity;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.repository.RoleJpaRepository;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.repository.UserHomeJpaRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
@NoArgsConstructor
public class UserMapper {

    @Autowired
    private HomeMapper homeMapper;
    @Autowired
    private RoleJpaRepository roleRepository;


    public User toDomain(JpaUsersEntity entity){
        User domain = new User();

        domain.setCpf(entity.getCpf());
        domain.setId(entity.getId());
        domain.setName(entity.getName());
        domain.setPassword(entity.getPassword());
        if(entity.getHomesOwner() != null){
            domain.setHomesOwner(entity.getHomesOwner().stream().map(home -> homeMapper.toDomain(home)).toList());
        }else {
            domain.setHomesOwner(null);
        }
        domain.setRole(this.convertRoleEnumDomain(entity.getRole()));

        return domain;
    }

    public JpaUsersEntity toEntity(User user){
        JpaUsersEntity entity = new JpaUsersEntity();

        entity.setCpf(user.getCpf());
        entity.setName(user.getName());
        entity.setPassword(user.getPassword());
        entity.setId(user.getId());
        entity.setRole(this.convertRoleEnumEntity(user));

        if(user.getHomesOwner() != null){
            entity.setHomesOwner(user.getHomesOwner().stream().map(home -> homeMapper.toEntity(home)).toList());
        }else {
            entity.setHomesOwner(null);
        }

        return entity;
    }

    public JpaUsersEntity toEntityReference(User user) {
        JpaUsersEntity entity = new JpaUsersEntity();
        entity.setId(user.getId());

        return entity;
    }

    private Role convertRoleEnumDomain(JpaRoleEntity role){
        return role.getRole();
    }

    private JpaRoleEntity convertRoleEnumEntity(User user){
       return roleRepository.findByRole(user.getRole()).orElseThrow();
    }

}
