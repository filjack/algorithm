package com.algorithm.arr;

import java.util.Arrays;

/**
 * <pre>
 * 给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
 *
 * 不占用额外内存空间能否做到？
 *  [1,2,3]
 *  [4,5,6]
 *  [7,8,9]
 *
 *  [7,4,1]
 *  [8,5,2]
 *  [9,6,3]
 * <pre/>
 * @author: d_fei
 * @since: 2023/5/11 11:40
 */
public class TdArr1 {

    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] result = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[j][row - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = result[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int[][] instance = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        TdArr1 tdArr1 = new TdArr1();
        tdArr1.rotate(instance);
        System.out.println(Arrays.deepToString(instance));
    }

}
