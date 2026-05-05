package com.app.kendaraan.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Kendaraan {

    @Id
    @Column(nullable = false)
    private String nomorRegistrasi;

    @Column(nullable = false)
    private String namaPemilik;

    @Column(columnDefinition = "TEXT")
    private String alamat;

    private String merkKendaraan;

    private Integer tahunPembuatan;

    private Integer kapasitasSilinder;

    private String warnaKendaraan;

    private String bahanBakar;
}