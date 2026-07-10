package com.elclubdelospeludos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity


@Table(name = "tb_orden")
public class OrdenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orden_id", unique = true, nullable = false)
    private Integer ordenId;

    @Column(name = "fecha_orden", nullable = false)
    private Date fechaOrden;

}
