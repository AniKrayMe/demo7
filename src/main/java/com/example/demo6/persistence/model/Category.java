package com.example.demo6.persistence.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Objects;

public class Category extends AbstractBaseEntity{

    //region Properties
    private String name;


    //endregion

    //region Constructors
    public Category() {
    }

    public Category(String name) {
        this.name = name;
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
        if (!super.equals(o)) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }

    //endregion

}
