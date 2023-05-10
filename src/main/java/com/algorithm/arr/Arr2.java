package com.algorithm.arr;

/**
 * <pre>
 * 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 请必须使用时间复杂度为 O(log n) 的算法。
 *
 * 作者：LeetCode
 * 链接：https://leetcode.cn/leetbook/read/array-and-string/cxqdh/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * <pre/>
 */
public class Arr2 {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Arr2 arr2 = new Arr2();
//        System.out.println(arr2.searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(arr2.searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(arr2.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

}
