package com.ipb.projekt.dataRepositories;
import org.springframework.data.repository.CrudRepository;
import com.ipb.projekt.entites.RamEntity;

public interface RamRepository extends CrudRepository<RamEntity, Integer> {
}
