package com.moonskyer.offer;

import com.moonskyer.common.ListNode;

import java.util.Arrays;

public class Offer06 {
    public static int[] reversePrint(ListNode head) {
        int[] temp = new int[10000];
        int index = 9999;
        while (head != null) {
            temp[index--] = head.val;
            head = head.next;
        }
        return Arrays.copyOfRange(temp, index + 1, 10000);
    }
}
