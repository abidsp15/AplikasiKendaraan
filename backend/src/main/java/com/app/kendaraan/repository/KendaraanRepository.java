package com.app.kendaraan.repository;

import com.app.kendaraan.entity.Kendaraan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KendaraanRepository extends JpaRepository<Kendaraan, String> {
}