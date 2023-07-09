package algorithm;

import java.util.Arrays;

/**
 * @author shkstart
 * @create 2023-06-19 23:02
 */
public class arr59 {
    public static void main(String[] args) {
        int n=5;//用于标记阶数
        int sum=n*n;//全部数量
        int[][] arr=new int[n][n];//二维数组
        int x=0,y=0;//两个索引位置
        int num=1;//用于赋值的递增的值
        int round=n/2;
        while (round>0) {
            //上边
            for (; x < n - 1; x++) {
                arr[y][x] = num;
                num++;
            }
            //右边
            for (; y < n - 1; y++) {
                arr[y][x] = num;
                num++;
            }
            //下边
            for (; x > 0; x--) {
                arr[y][x] = num;
                num++;
            }
            //左边
            for (; y > 0; y--) {
                arr[y][x] = num;
                num++;
            }
            n--;
            round--;//圈数减1
            y++;
            x++;
            for (int[] row : arr) {
                System.out.println(Arrays.toString(row));
            }
        }



    }
}
