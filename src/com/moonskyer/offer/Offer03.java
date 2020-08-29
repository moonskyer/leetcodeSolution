package com.moonskyer.offer;

public class Offer03 {
    public static int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[nums[i]] == nums[i]) {
                    return nums[i];
                } else {
                    int tmp = nums[nums[i]];
                    nums[nums[i]] = nums[i];
                    nums[i] = tmp;
                }
            }
        }
        return -1;
    }
}
