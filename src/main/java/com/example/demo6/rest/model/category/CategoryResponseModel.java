package com.example.demo6.rest.model.category;

import java.io.Serializable;
import java.util.Objects;

public class CategoryResponseModel implements Serializable {

    private static final long serialVersionUID = -7995179446550889683L;


    //region Properties
    private Long id;
    private String name;
    //endregion

    //region Constructors

    public CategoryResponseModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryResponseModel() {
    }
    //endregion

    //region Getters and Setters methods

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
        CategoryResponseModel that = (CategoryResponseModel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "CategoryResponseModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    //endregion

}
