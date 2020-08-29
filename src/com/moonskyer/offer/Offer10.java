package com.moonskyer.offer;

public class Offer10 {
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int first = 0;
        int second = 1;
        for (int i = 2; i <= n; i++) {
            int temp = (first + second) % 1000000007;
            first = second;
            second = temp;
        }
        return second;
    }

    public static int numWays(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        int first = 1;
        int second = 1;
        for (int i = 2; i <= n; i++) {
            int temp = (first + second) % 1000000007;
            first = second;
            second = temp;
        }
        return second;
    }
}
