package com.hexagonal.ApiHexagonal.domain.model;

import com.hexagonal.ApiHexagonal.domain.model.enums.StatusHome;

import java.util.List;
import java.util.UUID;

public class Home {

    private UUID id;

    private StatusHome statusHome;

    private Address address;

    private List<Rooms> rooms;

    private List<BillHouse> bills;
}
