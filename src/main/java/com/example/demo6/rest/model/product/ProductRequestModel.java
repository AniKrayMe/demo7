package com.example.demo6.rest.model.product;

import java.io.Serializable;
import java.util.Objects;

public class ProductRequestModel implements Serializable {

    private static final long serialVersionUID = -5878552067392985028L;

    //region Properties
    private String name;
    private int prise;
    private Long cageId;
    //endregion

    //region Constructors

    public ProductRequestModel(String name, int prise, Long cageId) {
        this.name = name;
        this.prise = prise;
        this.cageId = cageId;
    }

    public ProductRequestModel() {
    }
    //endregion

    //region Getters and Setters methods

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    public Long getCageId() {
        return cageId;
    }

    public void setCageId(Long cageId) {
        this.cageId = cageId;
    }

    //endregion

    //region Equals, Hashcode, toString

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRequestModel that = (ProductRequestModel) o;
        return prise == that.prise &&
                Objects.equals(name, that.name) &&
                Objects.equals(cageId, that.cageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, prise, cageId);
    }

    @Override
    public String toString() {
        return "ProductRequestModel{" +
                "name='" + name + '\'' +
                ", prise=" + prise +
                ", cageId=" + cageId +
                '}';
    }
    //endregion
}
