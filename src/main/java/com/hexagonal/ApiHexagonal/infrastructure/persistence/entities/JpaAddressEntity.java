package com.hexagonal.ApiHexagonal.infrastructure.persistence.entities;

import com.hexagonal.ApiHexagonal.domain.model.enums.State;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "address")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JpaAddressEntity {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private int number;

    @Column(nullable = false)
    private String cep;

    @ManyToOne
    @JoinColumn(name = "id_state")
    private JpaStateEntity state;

}
