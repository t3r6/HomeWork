package com.lesson16.part6;

import java.util.Comparator;

/**
 * Создать класс Товар, имеющий переменные имя, цена, рейтинг.
 * Создать класс Категория, имеющий переменные имя и множество товаров.
 * Создать несколько объектов класса Категория.
 * Создать метод, распечатывающий товары каталога, отсортированные по имени, цене или рейтингу.
 * Используем классы компараторы для каждого вида сортировки.
 */

public class ProductComparatorPice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() > o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() < o2.getPrice()) {
            return -1;
        }
        return 0;
    }
}
