package com.hexagonal.ApiHexagonal.infrastructure.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "rooms")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JpaRoomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_home")
    private JpaHomeEntity home;
}
