package com.ipb.projekt.dataRepositories;
import org.springframework.data.repository.CrudRepository;
import com.ipb.projekt.entites.CpuEntity;

public interface CpuRepository extends CrudRepository<CpuEntity, Integer> {
}
