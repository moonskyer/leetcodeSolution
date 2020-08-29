package com.moonskyer.offer;

public class Offer05 {
    public static String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                sb.append("%20");
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
