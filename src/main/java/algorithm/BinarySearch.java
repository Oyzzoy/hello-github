package algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author shkstart
 * @create 2023-06-08 21:28
 */
public class BinarySearch {
    public static void main(String[] args) {
    int[] arr=new int[20];
    int n;
    //循环赋值
    Random random = new Random();
    for (int i=0;i<arr.length;i++){
        arr[i]= random.nextInt(100 - 1 +1)+1;
    }
    //冒泡排序
    for (int i=0;i<arr.length-1;i++){
        for (int j=0;j<arr.length-i-1;j++){
             if (arr[j] > arr[j+1]){
                n=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=n;
            }
        }
    }

        String arrays = Arrays.toString(arr);
        System.out.println(arrays);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("：");
        int i = scanner.nextInt();
        //查看元素是否存在
        int flag = Arrays.binarySearch(arr, i);
        //最小索引
        int low=0;
        //最大索引
        int high=arr.length;
        //中间索引
        int centre;
        //值
        int num;
        if (flag >=0){
            while (true){
                num=arr[(low+high)/2];
                centre=(low+high)/2;
                if (num==i){
                    System.out.println(centre+1);
                    break;
                }else if(num>i){
                    high=centre;
                    continue;
                }else if(num<i){
                    low=centre;
                    continue;
                }
            }
        }






    }

}
