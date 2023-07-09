package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @create 2023-05-21 18:58
 */
public class Fibonacci {
    public static void main(String[] args) {
        //方法1：
//        int n=10;
//       int[] dp=new int[n];
//       dp[0]=1;
//       dp[1]=1;
//       for (int i=2;i<n;i++){
//           dp[i]=dp[i-1]+dp[i-2];//1
//       }
//        System.out.println(dp[n-1]);


        //方法2：
        int n=10;
        int sum=0;
        int[] dp=new int[n];
        dp[0]=1;
        dp[1]=1;

        for (int i=2;i<n;i++) {
           sum = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = sum;
        }
        System.out.println(sum);


    }
}
