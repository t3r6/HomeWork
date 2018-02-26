package com.forTesting;

public class Anything2 {
    private static void qs(int items[],int left, int right){

        int i,j;
        int x,y;

        i = left; j = right;

        x = items[(left+right)/2];

        do {
            while ((items[i]<x) && (i<right)) i++;
            while ((x<items[j]) && (j > left)) j--;

            // Мы сравниваем индексы массива или их значения??
            if (i <= j) {

                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;j--;

            }
        } while (i<=j);
        // Для чего оператор if не совсем понятно?
        if (left<j) qs(items,left,j);
        if(i<right) qs(items,i,right);

    }

}
