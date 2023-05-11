package com.algorithm.str;

/**
 * <pre>
 *     编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 *     <pre/>
 *
 * @author: d_fei
 * @since: 2023/5/11 20:59
 */
public class Str1 {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        int len = strs.length;
        int f_len = first.length();
        StringBuilder pre = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < f_len; i++) {
            for (int j = 1; j < len; j++) {
                if (i + 1 > strs[j].length() || strs[j].charAt(i) != first.charAt(i)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
            pre.append(first.charAt(i));
        }
        return pre.toString();
    }

    public static void main(String[] args) {
        Str1 str1 = new Str1();
        String[] strings = {"flower", "flow", "flight"};
//        String[] strings = {"ab", "a"};
        System.out.println(str1.longestCommonPrefix(strings));
    }

}
