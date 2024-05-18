package com.example.demo5.part8;

import java.util.Arrays;

public class Quick {
    public static void sort(Comparable[] a) {
        // Shuffle to ensure performance guarantee
        // StdRandom.shuffle(a);

        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        Comparable pivot = a[lo];
        while (true) {
            while (less(a[++i], pivot)) if (i == hi) break;
            while (less(pivot, a[--j])) if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Test cases
    public static void main(String[] args) {
        Integer[] a = {5, 2, 7, 0, 3, 9};
        System.out.println("Unsorted array:");
        printArray(a);

        sort(a);

        System.out.println("Sorted array:");
        printArray(a);

        // Additional test cases
        String[] b = {"apple", "orange", "banana", "kiwi"};
        System.out.println("Unsorted array:");
        printArray(b);

        sort(b);

        System.out.println("Sorted array:");
        printArray(b);
    }

    private static void printArray(Comparable[] a) {
        for (Comparable item : a) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

