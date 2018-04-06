package com.lesson16.part06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Переделать задание (класс Товар),  используя Collections.sort() для сортировки.
 * Добавить возможность сортировать в обратном порядке (Collections.reverse()).
 */

public class ShopCollections {
    public static void main(String[] args) {
        List<Product> products1 = new ArrayList<>();
        products1.add(new Product("Dress", 1002.4, 4));
        products1.add(new Product("Jeans", 700.4, 5));
        products1.add(new Product("Shirt", 500.57, 3));
        products1.add(new Product("Pants", 600.57, 5));
        products1.add(new Product("Tie", 200.57, 4));

        /*Category category = new Category("Clothes", products1);*/

        Collections.sort(products1);
        System.out.println("Sorting by rating: ");
        products1.forEach(System.out::println);
        Collections.sort(products1, Collections.reverseOrder());
        System.out.println("\nReverse sorting by rating: ");
        products1.forEach(System.out::println);

        Collections.sort(products1, new ProductComparatorName());
        System.out.println("\nSorting by name: ");
        products1.forEach(System.out::println);
        Collections.sort(products1, Collections.reverseOrder(new ProductComparatorName()));
        System.out.println("\nReverse sorting by name: ");
        products1.forEach(System.out::println);

        Collections.sort(products1, Collections.reverseOrder(new ProductComparatorPrice()));
        System.out.println("\nSorting by price: ");
        products1.forEach(System.out::println);
        Collections.sort(products1, new ProductComparatorPrice());
        System.out.println("\nReverse sorting by price: ");
        products1.forEach(System.out::println);
    }
}
