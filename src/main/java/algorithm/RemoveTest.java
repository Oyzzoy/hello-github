package algorithm;

import java.util.Arrays;
import java.util.Random;

/**
 * @author shkstart
 * @create 2023-06-09 23:35
 */
public class RemoveTest {
    public static void main(String[] args) {
        int[] arr=new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));
        //循环查找元素
        int o=3;
        int[] arr2=new int[10];
        for (int i=0;i< arr.length;i++){
            if(arr[i]==o){
                for (int n=0;n<i;n++){
                    arr2[n]=arr[n];
                }
                for (int m=i;m<arr2.length-1;m++){
                    arr2[m]=arr[m+1];
                }
                break;
            }
        }
        System.out.println(Arrays.toString(arr2));

    }
}
