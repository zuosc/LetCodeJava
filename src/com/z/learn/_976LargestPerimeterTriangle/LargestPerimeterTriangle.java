package com.z.learn._976LargestPerimeterTriangle;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] A = new int[]{3, 2, 3, 4};
        System.out.println("数组A：" + Arrays.toString(A) + "能组成的最大周长的三角形周长为：" + largestPerimeter(A));
    }

    private static int largestPerimeter(int[] A) {
        int result = 0;
        Arrays.sort(A);

        for (int i = A.length - 1; i > 0; i--) {
            if (i - 2 >= 0) {
                int a = A[i];
                int b = A[i - 1];
                int c = A[i - 2];
                if (a + b > c && a + c > b && b + c > a) {
                    result = a + b + c;
                    break;
                }
            } else {
                break;
            }
        }
        return result;
    }
}
