package com.supermercado._5.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "sucursal")
public class SucursalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSucursal", unique = true, nullable = false)
    private Long idSucursal;

    @Column(name = "nombreSucursal", nullable = false)
    private String nombreSucursal;

    @Column(name = "direccionSucursal")
    private String direccionSucursal;
}
