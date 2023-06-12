package algorithm;

import java.util.Arrays;
import java.util.Random;

/**
 * @author shkstart
 * @create 2023-06-10 22:55
 */
public class ArrayArray {
    public static void main(String[] args) {
        int[] arr=new int[10000];
        Random random = new Random();
        //赋值
        for (int i=0;i<arr.length;i++){
            arr[i]= random.nextInt(1000 - 100 +1)-100;
        }
        System.out.println(Arrays.toString(arr));

        long l = System.currentTimeMillis();
        System.out.println(l);
        //排序
        int n;
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j] > arr[j+1]){
                    n=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=n;
                }
            }
        }

        int[] arr2=new int[arr.length];
        int a=0;
        int i=0;
        int b=arr.length-1;
        //方法1平方比较后
        while (a<=b) {
            if (arr[a] * arr[a] > arr[b] * arr[b]) {
                arr2[i]=arr[a] * arr[a];
                a++;
            } else{
                arr2[i]=arr[b]* arr[b];
                b--;
            }
            i++;
        }

        System.out.println(Arrays.toString(arr2));
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);

    }

}
