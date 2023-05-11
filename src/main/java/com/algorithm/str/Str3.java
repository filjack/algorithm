package com.algorithm.str;

/**
 * <pre>
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * 作者：LeetCode
 * 链接：https://leetcode.cn/leetbook/read/array-and-string/cacxi/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * <pre/>
 * @author: d_fei
 * @since: 2023/5/11 21:54
 */
public class Str3 {
    public void reverseString(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }
        int h = 0, t = s.length - 1;
        char tmp;
        while (h < t) {
            tmp = s[h];
            s[h] = s[t];
            s[t] = tmp;
            h++;
            t--;
        }
    }

    public static void main(String[] args) {
        Str3 str3 = new Str3();
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        str3.reverseString(chars);
        System.out.println(chars);
    }
}
