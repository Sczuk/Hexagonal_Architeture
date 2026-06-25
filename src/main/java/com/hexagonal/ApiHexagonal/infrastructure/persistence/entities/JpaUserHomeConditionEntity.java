package com.hexagonal.ApiHexagonal.infrastructure.persistence.entities;


import com.hexagonal.ApiHexagonal.domain.model.enums.UserHomeCondition;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "user_home_conditions/")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JpaUserHomeConditionEntity {

    @Id
    private int id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UserHomeCondition condition;

}
