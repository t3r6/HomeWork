package com.lesson16.part06;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Создать класс Товар, имеющий переменные имя, цена, рейтинг.
 * Создать класс Категория, имеющий переменные имя и множество товаров.
 * Создать несколько объектов класса Категория.
 * Создать метод, распечатывающий товары каталога, отсортированные по имени, цене или рейтингу.
 * Используем классы компараторы для каждого вида сортировки.
 */

public class Shop {
    public static void main(String[] args) {
        SortedSet<Product> products1 = new TreeSet<>();
        products1.add(new Product("Dress", 1002.4, 4));
        products1.add(new Product("Jeans", 700.4, 5));
        products1.add(new Product("Shirt", 500.57, 3));
        products1.add(new Product("Pants", 600.57, 5));
        products1.add(new Product("Tie", 200.57, 4));

        Category category = new Category("Clothes", products1);


        /*Set<Product> products2 = new TreeSet<>(new ProductComparatorName());
        products2.addAll(products1);
        Set<Product> products3 = new TreeSet<>(new ProductComparatorPice());
        products3.addAll(products1);

        print(products1);
        print(products2);
        print(products3);*/

        print(category, new ProductComparatorPice());
        print(category, new ProductComparatorName());
        print(category, category.getProducts().comparator());
    }

    public static void print(Set<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println();
    }

    public static void print(Category category, Comparator<? super Product>comparator){
        Set<Product>set = new TreeSet<>(comparator);
        set.addAll(category.getProducts());
        print(set);
    }
}
