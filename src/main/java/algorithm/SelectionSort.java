package algorithm;


import java.util.Arrays;

/**
 * @author shkstart
 * @create 2023-07-02 20:41
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] a={5,3,5,6,2,6,7};
        selection(a);
    }
    public static void selection(int[] a){
        for (int i=0;i<a.length;i++){
            //i表示每轮选出最小元素要交互的索引位置
            int s=i;
            for (int j=s+1;j<a.length;j++){
                if (a[s]>a[j]){
                    s=j;
                }
            }
            if (s!=i){
                int b=a[i];
                a[i]=a[s];
                a[s]=b;
            }
            System.out.println(Arrays.toString(a));
        }
    }
}
