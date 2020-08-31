package com.moonskyer.offer;

public class Offer67 {
    public int strToInt(String str) {
        int index=0;
        //跳过空格
        while(index<str.length()&&str.charAt(index)==' '){
            index++;
        }
        //判断是否是合法字符
        if(index==str.length()||!(isSign(str,index)||isNumber(str,index))){
            return 0;
        }
        boolean minus=false;
        if(isSign(str,index)){
            char c=str.charAt(index);
            minus=c=='-';
            index++;
        }
        long result=0;
        while(index<str.length()&&isNumber(str,index)){
            result=result*10+(str.charAt(index)-'0');
            index++;
            if(minus&&result>Integer.MAX_VALUE){
                return Integer.MIN_VALUE;
            }
            if(!minus&&result>Integer.MAX_VALUE-1){
                return Integer.MAX_VALUE;
            }
        }
        return minus?(int)(-result):(int)result;
    }

    public boolean isSign(String str,int index){
        char c=str.charAt(index);
        return c=='+'||c=='-';
    }
    public boolean isNumber(String str,int index){
        char c=str.charAt(index);
        return c>='0'&&c<='9';
    }
}
