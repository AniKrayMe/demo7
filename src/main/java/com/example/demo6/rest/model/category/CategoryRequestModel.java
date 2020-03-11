package com.example.demo6.rest.model.category;

import java.io.Serializable;
import java.util.Objects;

public class CategoryRequestModel implements Serializable {

    private static final long serialVersionUID = 6813132972661820574L;

    //region Properties
    private String name;
    //endregion

    //region Constructors

    public CategoryRequestModel(String name) {
        this.name = name;
    }

    public CategoryRequestModel() {
    }
    //endregion

    //region Getters and Setters methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //endregion

    //region Equals, Hashcode, toString

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryRequestModel that = (CategoryRequestModel) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "CategoryRequestModel{" +
                "name='" + name + '\'' +
                '}';
    }
    //endregion
}
