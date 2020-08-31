package com.moonskyer.offer;

public class Offer66 {
    public int[] constructArr(int[] a) {
        int[] b = new int[a.length];
        int current = 1;
        for (int i = 0; i < b.length; i++) {
            b[i] = current;
            current *= a[i];
        }
        current = 1;
        for (int j = b.length - 1; j >= 0; j--) {
            b[j] *= current;
            current *= a[j];
        }
        return b;
    }
}
