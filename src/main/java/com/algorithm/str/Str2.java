package com.algorithm.str;

import java.util.Stack;

/**
 * <pre>
 *     给你一个字符串 s ，请你反转字符串中 单词 的顺序。
 *
 * 单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
 *
 * 返回 单词 顺序颠倒且 单词 之间用单个空格连接的结果字符串。
 *
 * 注意：输入字符串 s中可能会存在前导空格、尾随空格或者单词间的多个空格。返回的结果字符串中，单词间应当仅用单个空格分隔，且不包含任何额外的空格。
 *
 * 输入：s = "  hello world  "
 * 输出："world hello"
 * 解释：反转后的字符串中不能存在前导空格和尾随空格。
 *
 * 作者：LeetCode
 * 链接：https://leetcode.cn/leetbook/read/array-and-string/crmp5/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * <pre/>
 * @author: d_fei
 * @since: 2023/5/11 21:31
 */
public class Str2 {

    public String reverseWords(String s) {
        String[] strings = s.trim().split("\\s+");
        Stack<String> stringStack = new Stack<>();
        for (String s1 : strings) {
            stringStack.push(s1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stringStack.isEmpty()) {
            stringBuilder.append(stringStack.pop()).append(" ");
        }
        return stringBuilder.substring(0, stringBuilder.length() - 1);
    }

    public static void main(String[] args) {
        Str2 str2 = new Str2();
        System.out.println(str2.reverseWords("the sky is blue"));
        System.out.println(str2.reverseWords("  hello world  "));
        System.out.println(str2.reverseWords("a good   example"));
    }

}
