package com.z.learn._775globalAndLocalInversions;
/*
数组 A 是 [0, 1, ..., N - 1] 的一种排列，N 是数组 A 的长度。全局倒置指的是 i,j 满足 0 <= i < j < N 并且 A[i] > A[j] ，局部倒置指的是 i 满足 0 <= i < N 并且 A[i] > A[i+1] 。
当数组 A 中全局倒置的数量等于局部倒置的数量时，返回 true 。
 */
public class GlobalAndLocalInversions {
    /*
1、数组没有重复元素
2、局部倒置一定是全局倒置
3、题目的目的也就是找   非局部倒置的全局倒置
 */
    public static void main(String[] args) {
        int[] A = new int[]{0, 1, 3, 2, 4};
        System.out.println(isIdealPermutation(A));

        int[] B = new int[]{0, 1, 3, 2, 4,8,5,7,6};
        System.out.println(isIdealPermutation(B));
    }

    private static boolean isIdealPermutation(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] - i > 1 || A[i] - i < -1) {
                return false;
            }
        }
        return true;
    }
}

