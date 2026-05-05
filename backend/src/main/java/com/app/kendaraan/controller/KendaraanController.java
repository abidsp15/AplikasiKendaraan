package com.app.kendaraan.controller;

import com.app.kendaraan.entity.Kendaraan;
import com.app.kendaraan.repository.KendaraanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kendaraan")
@CrossOrigin(origins = "http://localhost:3000")
public class KendaraanController {

    @Autowired
    private KendaraanRepository repo;

    @GetMapping
    public List<Kendaraan> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Kendaraan create(@RequestBody Kendaraan k) {
        return repo.save(k);
    }

    @PutMapping("/{id}")
    public Kendaraan update(@PathVariable String id, @RequestBody Kendaraan k) {
        k.setNomorRegistrasi(id);
        return repo.save(k);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}