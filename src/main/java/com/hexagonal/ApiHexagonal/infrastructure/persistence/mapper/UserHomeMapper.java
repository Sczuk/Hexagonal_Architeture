package com.hexagonal.ApiHexagonal.infrastructure.persistence.mapper;

import com.hexagonal.ApiHexagonal.domain.model.UserHome;
import com.hexagonal.ApiHexagonal.domain.model.enums.UserHomeCondition;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaUserHomeConditionEntity;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.entities.JpaUserHomeEntity;
import com.hexagonal.ApiHexagonal.infrastructure.persistence.repository.UserHomeConditionJpaRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class UserHomeMapper {

    @Autowired
    private UserHomeConditionJpaRepository userHomeConditionRepository;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private HomeMapper homeMapper;

    public UserHome toDomain(JpaUserHomeEntity entity){
        UserHome userHome = new UserHome();

        userHome.setUser(userMapper.toDomain(entity.getUser()));
        userHome.setHome(homeMapper.toDomain(entity.getHome()));
        userHome.setId(entity.getId());
        userHome.setCondition(this.convertUserHomeConditionEnum(entity));

        return userHome;
    }

    public JpaUserHomeEntity toEntity(UserHome userHome){
        JpaUserHomeEntity entity = new JpaUserHomeEntity();

        entity.setCondition(convertUserHomeConditionEntity(userHome));
        entity.setHome(homeMapper.toEntityReferences(userHome.getHome()));
        entity.setId(userHome.getId());
        entity.setUser(userMapper.toEntityReference(userHome.getUser()));

        return entity;

    }

    private JpaUserHomeConditionEntity convertUserHomeConditionEntity(UserHome userHome){
        return userHomeConditionRepository.findByCondition(userHome.getCondition()).orElseThrow();
    }

    private UserHomeCondition convertUserHomeConditionEnum(JpaUserHomeEntity entity){
        return entity.getCondition().getCondition();
    }
}
