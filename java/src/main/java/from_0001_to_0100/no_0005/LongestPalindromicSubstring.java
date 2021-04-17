package from_0001_to_0100.no_0005;

/**
 * 最长回文子串
 *
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 * 示例 1：
 *
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 *
 * 示例 2：
 *
 * 输入：s = "cbbd"
 * 输出："bb"
 *
 * 示例 3：
 *
 * 输入：s = "a"
 * 输出："a"
 *
 * 示例 4：
 *
 * 输入：s = "ac"
 * 输出："a"
 *
 * @author: pf_xu
 * @date: 2021/1/24 15:41
 * @Email:pfxuchn@gmail.com
 */
public class LongestPalindromicSubstring {

    /**
     * 一个回文子串两边添加相同的字符后仍然应该是一个回文子串
     * 如 cbc => acbca
     * 1. dp[i][j] 表示 第i字符到第j个字符组成的字符串是否为回文字符串
     * 2. dp[i+1][j-1] is true &&  s[i] == s[j]
     *          ==>  dp[i][j] is true
     * 3. 确定初始值
     *      when i == j then dp[i][j] = true
     *      when j == i + 1 if s[i] == s[j] then dp[i][j] = true
     *
     * 时间复杂度 O(n^2)
     * 空间复杂度 O(n^2)
     * @param s 传入的字符串参数
     * @return 最长回文子串
     */
    public String longestPalindrome(String s) {

        boolean [][] dp = new boolean[s.length()][s.length()];

        for(int i = s.length();i>=0;i--){
            for(int j = i;j<s.length();j++){
                if(i == j){
                    dp[i][j] = true;
                    continue;
                }
                if(s.charAt(i) != s.charAt(j)){
                    continue;
                }
                if (i + 1 == j || i+1 < s.length() && dp[i+1][j-1]){
                    dp[i][j] = true;
                }
            }
        }

        int max = -1;
        int maxI = -1;
        int maxJ = -1;
        for(int i = 0;i<s.length();i++){
            for(int j = 0;j<s.length();j++){
                if(dp[i][j] && j-i>max){
                    max = j-i;
                    maxI = i;
                    maxJ = j;
                }
            }
        }

        return s.substring(maxI,maxJ+1);
    }

}
