package com.moonskyer.offer;

public class Offer16 {

    public double myPow(double x, int n) {
        long nn = n;
        if (nn == 0) return 1;
        double ans = 1;
        boolean minus = false;
        if (nn < 0) {
            nn = -nn;
            minus = true;
        }
        while (nn > 1) {
            if (nn % 2 == 0) {
                x *= x;
                nn /= 2;
            } else {
                ans *= x;
                x *= x;
                nn /= 2;
            }
        }
        return minus ? 1 / (ans * x) : ans * x;
    }
}
