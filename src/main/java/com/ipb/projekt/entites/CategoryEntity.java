package com.ipb.projekt.entites;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Category", schema = "mas")
public class CategoryEntity {
    private int idCategory;
    private String name;
    private Collection<ProductEntity> productEntities;

    @Id
    @Column(name = "id_category")
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryEntity that = (CategoryEntity) o;
        return idCategory == that.idCategory &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCategory, name);
    }

    @OneToMany(mappedBy = "category")
    public Collection<ProductEntity> getProductEntities() {
        return productEntities;
    }

    public void setProductEntities(Collection<ProductEntity> productEntities) {
        this.productEntities = productEntities;
    }
}
