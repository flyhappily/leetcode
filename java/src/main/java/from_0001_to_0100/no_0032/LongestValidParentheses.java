package from_0001_to_0100.no_0032;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 最长有效括号
 *
 * 题目：给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
 *
 * 示例 1：
 * 输入：s = "(()"
 * 输出：2
 * 解释：最长有效括号子串是 "()"
 *
 * 示例 2：
 * 输入：s = ")()())"
 * 输出：4
 * 解释：最长有效括号子串是 "()()"
 *
 * 示例 3：
 * 输入：s = ""
 * 输出：0
 *
 * @author: pf_xu
 * @date: 2021/1/24 22:32
 * @Email:pfxuchn@gmail.com
 */
public class LongestValidParentheses {


    /**
     * 1. 设dp[i][j]表示第i个字符到第j个字符组成的括号字符串是否合法
     * 2. dp[i][j] = dp[i][j-2] && s[j-1]==‘(’ && s[j]==‘)’
     *    dp[i][j] = dp[i+2][j] && s[i]==‘(’ && s[i+1]==‘)’
     *
     * 3. when i+1 = j if s[i]==‘(’ && s[j]==‘)’ then dp[i][j] is true
     *
     * @param s 字符串
     * @return 最长有效括号的长度
     */

    /**
     * 理解错误，此方法将此类字符串 "()(())" 识别为非法
     * @param s
     * @return
     */
    public int longestValidParentheses(String s) {
        if(s.length()<2){
            return 0;
        }
        boolean [][] dp = new boolean[s.length()][s.length()];

        for(int i = s.length();i>=0;i--){
            for(int j = i;j<s.length();j++){
                if(i==j){
                    dp[i][j] = true;
                }
                else if ( i + 1 == j && s.charAt(i)=='(' && s.charAt(j)==')'){
                    dp[i][j] = true;
                }
                else if((i+2)<s.length()-1 && dp[i+2][j]){
                    if(s.charAt(i)=='(' && s.charAt(i+1)==')'){
                        dp[i][j] = true;
                    }

                }


            }
        }

        int maxLength = 0;

        for(int i = 0;i<s.length();i++){
            for(int j = 0;j<s.length();j++){
                if(i!=j && dp[i][j] && (j-i+1)>maxLength){
                    maxLength = j-i+1;
                }
            }
        }

        return maxLength;
    }


    /**
     * 用栈实现
     * @param s
     * @return
     */
    public int longestValidParenthesesWithStack(String s){
        int maxLength = 0;
        List<Character> result = new ArrayList<>();
        Stack<Character> stack  = new Stack<>();
        int index = -1;
        boolean isIndex = false;
        for(int i = 0;i<s.length();i++){

            if(s.charAt(i)==')'&& stack.empty()){
                continue;
            }
            if(s.charAt(i) == '('){
                //没记录索引则记录当前索引位置
                if(!isIndex){
                    index = i;
                    isIndex = true;
                }
                stack.push(s.charAt(i));
            }
            else {
                if(!stack.isEmpty()){
                    result.add(stack.pop());
                    result.add(s.charAt(i));
                }
                else {
                    result.clear();
                }
            }
        }


        return maxLength;
    }

}
