package com.hexagonal.ApiHexagonal.infrastructure.persistence.entities;

import com.hexagonal.ApiHexagonal.domain.model.enums.StatusHome;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "status_home")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JpaStatusHomeEntity {

    @Id
    private int id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusHome status;

}
