package from_0001_to_0100.no_0070;

/**
 * 爬楼梯
 *
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 *      1.  1 阶 + 1 阶
 *      2.  2 阶
 *
 * @author: pf_xu
 * @date: 2021/1/24 15:10
 * @Email:pfxuchn@gmail.com
 */
public class ClimbingStairs {

    /**
     * 1 定义dp
     *
     *      设dp[n]为爬n阶楼梯的种类数
     *
     * 2 寻找递推关系
     *
     *      dp[n] = dp[n-1] + dp[n-2]
     *
     * 3 确定初始值
     *
     *      dp[0] = 0
     *
     *      dp[1] = 1
     *
     *      dp[2] = 2
     *
     * @param n
     * @return
     */

    public int climbStairs(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int [] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i<dp.length;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public int climbStairsV2(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int left = 1;
        int right = 2;
        int now = Integer.MIN_VALUE;
        int i = 3;
        while (i <= n){
            now = left + right;
            left = right;
            right = now;
            i = i+1;
        }
        return now;
    }


}
