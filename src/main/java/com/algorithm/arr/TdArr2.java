package com.algorithm.arr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * 编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。
 *
 * 输入：
 * [
 *   [1,1,1],
 *   [1,0,1],
 *   [1,1,1]
 * ]
 * 输出：
 * [
 *   [1,0,1],
 *   [0,0,0],
 *   [1,0,1]
 * ]
 * <pre/>
 *
 * @author xpf14
 * @since 2023/5/11 20:20
 */
public class TdArr2 {

    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        Map<Integer, Boolean> i_map = new HashMap<>();
        Map<Integer, Boolean> j_map = new HashMap<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    i_map.put(i, true);
                    j_map.put(j, true);
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i_map.containsKey(i)||j_map.containsKey(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] instance = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        TdArr2 tdArr2 = new TdArr2();
        tdArr2.setZeroes(instance);
        System.out.println(Arrays.deepToString(instance));
    }

}
