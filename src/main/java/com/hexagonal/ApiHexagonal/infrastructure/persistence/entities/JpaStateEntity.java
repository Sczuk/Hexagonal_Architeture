package com.hexagonal.ApiHexagonal.infrastructure.persistence.entities;

import com.hexagonal.ApiHexagonal.domain.model.enums.State;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "state")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JpaStateEntity {

    @Id
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private State state;

}
