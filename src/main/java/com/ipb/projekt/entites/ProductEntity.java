package com.ipb.projekt.entites;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Product", schema = "mas")
public class ProductEntity {
    private int idProduct;
    private String manufacturer;
    private Integer price;
    private Byte visibility;

    @Id
    @Column(name = "IdProduct")
    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    @Basic
    @Column(name = "Manufacturer")
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Basic
    @Column(name = "Price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    @Column(name = "Visibility")
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
}
