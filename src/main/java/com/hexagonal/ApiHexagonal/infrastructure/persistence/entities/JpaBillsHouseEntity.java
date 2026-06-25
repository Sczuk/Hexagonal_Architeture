package com.hexagonal.ApiHexagonal.infrastructure.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Table(name = "bills_house")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JpaBillsHouseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private Date date;

    @Column
    private double lightBill;

    @Column
    private double waterBill;

    @Column
    private double groceries;

    @Column
    private double internetBill;

    @Column
    private double rent;

    @ManyToOne
    @JoinColumn(name = "id_house")
    private JpaHomeEntity home;

}
