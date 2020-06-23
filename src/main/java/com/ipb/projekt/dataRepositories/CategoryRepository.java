package com.ipb.projekt.dataRepositories;
import org.springframework.data.repository.CrudRepository;
import com.ipb.projekt.entites.CategoryEntity;

public interface CategoryRepository extends CrudRepository<CategoryEntity, Integer> {
}
