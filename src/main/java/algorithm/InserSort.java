package algorithm;

/**
 * @author shkstart
 * @create 2023-07-02 21:26
 */
public class InserSort {
    public static void main(String[] args) {
        int[] a={5,3,5,6,2,6,7};
        inserSort(a);
    }
    public static void inserSort(int[] a){
        //i代表待插入元素的索引
        for (int i=1;i<a.length;i++){
            int t=a[i];
            int j=i-1;
            while (j>=0){
                if (t<a[j]){
                    a[j+1]=a[j];
                    a[j]=t;
                }else {
                    break;
                }
                j--;
            }
            a[j+1]=t;
        }

    }
}
