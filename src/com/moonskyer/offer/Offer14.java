package com.moonskyer.offer;

public class Offer14 {
    public int cuttingRope(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        int count3 = n / 3;
        int left = n % 3;
        int ans = 0;
        if (left == 1) {
            ans = 4;
            count3--;
        } else if (left == 0) {
            ans = 1;
        } else {
            ans = 2;
        }
        while (count3-- > 0) {
            ans *= 3;
        }
        return ans;
    }
}
