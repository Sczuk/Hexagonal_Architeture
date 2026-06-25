package com.hexagonal.ApiHexagonal.infrastructure.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "users_home")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JpaUserHomeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private JpaUsersEntity user;

    @ManyToOne
    @JoinColumn(name = "id_home")
    private JpaHomeEntity home;

    @ManyToOne
    @JoinColumn(name = "id_condition")
    private JpaUserHomeConditionEntity condition;

}
