package com.lesson16.part06;

import java.util.Collection;
import java.util.Objects;
import java.util.SortedSet;

/**
 * Создать класс Товар, имеющий переменные имя, цена, рейтинг.
 * Создать класс Категория, имеющий переменные имя и множество товаров.
 * Создать несколько объектов класса Категория.
 * Создать метод, распечатывающий товары каталога, отсортированные по имени, цене или рейтингу.
 * Используем классы компараторы для каждого вида сортировки.
 */

public class Category {
    private String name;
    private Collection<Product> products;

    public Category(String name, Collection<Product> products) {
        this.name = name;
        this.products = products;
    }

    public Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Product> getProducts() {
        return products;
    }

    public void setProducts(Collection<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name) &&
                Objects.equals(products, category.products);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, products);
    }

}
