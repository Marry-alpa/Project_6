package com.example.demo5.part2;

public class Selection {

    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
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
