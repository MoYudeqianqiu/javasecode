package com.youcao;

import java.util.Arrays;

public class StreamDemo4 {
    public static void main(String[] args) {
        //调用Arrays中的Stream来打印数组
        int[] arr={1,2,3,4,5};
        Arrays.stream(arr).forEach(s->System.out.println(s));

        String[] arr1={"a","b","c","d","e"};
        Arrays.stream(arr1).forEach(s->System.out.println(s));

    }
}
