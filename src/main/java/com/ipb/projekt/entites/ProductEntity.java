package com.ipb.projekt.entites;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "product", schema = "mas")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)
public class ProductEntity {
    private int idProduct;
    private String manufacturer;
    private Integer price;
    private Byte visibility;
    private CategoryEntity category;
    private String imgPath;
    private String name;

    public ProductEntity(int idProduct, String manufacturer, Integer price, Byte visibility, CategoryEntity category, String imgPath, String name) {
        this.idProduct = idProduct;
        this.manufacturer = manufacturer;
        this.price = price;
        this.visibility = visibility;
        this.category = category;
        this.imgPath = imgPath;
        this.name = name;
    }

    public ProductEntity() {
    }

    @Id
    @Column(name = "id_product")
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    @Basic
    @Column(name = "manufacturer")
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Basic
    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    @Column(name = "visibility")
    public Byte getVisibility() {
        return visibility;
    }

    public void setVisibility(Byte visibility) {
        this.visibility = visibility;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity that = (ProductEntity) o;
        return idProduct == that.idProduct &&
                Objects.equals(manufacturer, that.manufacturer) &&
                Objects.equals(price, that.price) &&
                Objects.equals(visibility, that.visibility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduct, manufacturer, price, visibility);
    }

    @ManyToOne
    @JoinColumn(name = "id_category")
    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    @Basic
    @Column(name = "img_path")
    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
