package com.algorithm.arr;

import java.util.Arrays;

/**
 * 求数组中心值索引
 *
 * @author: XiePF
 * @date: 2023/5/9 13:13
 */
public class Arr1 {

    public int solution(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (2 * sum + arr[i] == total) {
                return i;
            }
            sum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Arr1 arr1 = new Arr1();
        int[] arr = {2, 1, -1};
        System.out.println(arr1.solution(new int[]{2, 1, -1}));

    }

}
