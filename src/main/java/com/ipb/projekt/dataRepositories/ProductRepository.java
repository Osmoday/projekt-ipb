package com.ipb.projekt.dataRepositories;
import org.springframework.data.repository.CrudRepository;
import com.ipb.projekt.entites.ProductEntity;


public interface ProductRepository extends CrudRepository<ProductEntity, Integer>{
}
