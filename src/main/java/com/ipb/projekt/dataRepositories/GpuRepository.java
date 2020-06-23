package com.ipb.projekt.dataRepositories;
import org.springframework.data.repository.CrudRepository;
import com.ipb.projekt.entites.GpuEntity;

public interface GpuRepository extends CrudRepository<GpuEntity, Integer> {
}
