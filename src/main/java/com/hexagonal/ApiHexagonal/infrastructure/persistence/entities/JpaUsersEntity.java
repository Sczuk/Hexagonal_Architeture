package com.hexagonal.ApiHexagonal.infrastructure.persistence.entities;

import com.hexagonal.ApiHexagonal.domain.model.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Table(name = "users")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JpaUsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "id_role")
    private JpaRoleEntity role;


    @OneToMany(mappedBy = "user")
    private List<JpaUserHomeEntity> homes;

    @OneToMany
    @JoinTable(
            name = "owner_home",
            joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_home")
    )
    private List<JpaHomeEntity> homesOwner;

}
