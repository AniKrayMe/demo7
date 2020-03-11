package com.example.demo6.persistence.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.util.Objects;

public class Product extends AbstractBaseEntity {

    //region Properties
    private String name;
    private int prise;
    //endregion

    //region Constructors

    public Product(String name, int prise) {
        this.name = name;
        this.prise = prise;
    }

    public Product() {
    }
    //endregion

    //region Getters and Setters methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }


    //endregion

    //region Equals, Hashcode, toString

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Product product = (Product) o;
        return prise == product.prise &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, prise);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", prise=" + prise +
                '}';
    }
    //endregion

}


