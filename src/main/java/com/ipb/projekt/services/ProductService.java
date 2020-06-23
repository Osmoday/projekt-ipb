package com.ipb.projekt.services;

import com.ipb.projekt.dataRepositories.CpuRepository;
import com.ipb.projekt.dataRepositories.GpuRepository;
import com.ipb.projekt.dataRepositories.ProductRepository;
import com.ipb.projekt.dataRepositories.RamRepository;
import com.ipb.projekt.entites.CpuEntity;
import com.ipb.projekt.entites.GpuEntity;
import com.ipb.projekt.entites.ProductEntity;
import com.ipb.projekt.entites.RamEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final CpuRepository cpuRepository;
    private final GpuRepository gpuRepository;
    private final RamRepository ramRepository;

    @Autowired
    public ProductService(ProductRepository productRepository, CpuRepository cpuRepository, GpuRepository gpuRepository, RamRepository ramRepository) {
        this.productRepository = productRepository;
        this.cpuRepository = cpuRepository;
        this.gpuRepository = gpuRepository;
        this.ramRepository = ramRepository;
    }

    public Iterable<ProductEntity> getAll() {
        return this.productRepository.findAll();
    }

    public Iterable<RamEntity> getRam() {
        return this.ramRepository.findAll();
    }

    public Iterable<CpuEntity> getCpu() {
        return this.cpuRepository.findAll();
    }

    public Iterable<GpuEntity> getGpu() {
        return this.gpuRepository.findAll();
    }

    public Iterable<ProductEntity> getFiltered(String filter) {
        return this.productRepository.findAll();
    }

    public Optional<ProductEntity> getProductById(int id) {
        return this.productRepository.findById(id);
    }

    public void addNewCpu(CpuEntity e) {
        this.cpuRepository.save(e);
    }

    public void addNewGpu(GpuEntity e) {
        this.gpuRepository.save(e);
    }

    public void addNewRam(RamEntity e) {
        this.ramRepository.save(e);
    }

    public void removeProductById(int id) {
        this.productRepository.deleteById(id);
    }
}
