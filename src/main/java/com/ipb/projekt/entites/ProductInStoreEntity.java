package com.ipb.projekt.entites;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product_in_store", schema = "mas")
public class ProductInStoreEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private Integer amount;
    private String sector;
    private String shelf;

    @Basic
    @Column(name = "amount")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "sector")
    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Basic
    @Column(name = "shelf")
    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductInStoreEntity that = (ProductInStoreEntity) o;
        return id == that.id &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(sector, that.sector) &&
                Objects.equals(shelf, that.shelf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, sector, shelf);
    }

}
