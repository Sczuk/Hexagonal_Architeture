package com.hexagonal.ApiHexagonal.infrastructure.persistence.entities;

import com.hexagonal.ApiHexagonal.domain.model.Home;
import com.hexagonal.ApiHexagonal.domain.model.enums.StatusHome;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Table(name = "home")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JpaHomeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "id_status_house")
    private JpaStatusHomeEntity statusHome;

    @OneToOne
    @JoinColumn(name = "id_address")
    private JpaAddressEntity address;

    @OneToMany(mappedBy = "home")
    private List<JpaBillsHouseEntity> bills;

    @OneToMany(mappedBy = "home")
    private List<JpaRoomEntity> rooms;

}
