package algorithm;

/**
 * @author shkstart
 * @create 2023-06-13 22:35
 */
public class arr209 {
    public static void main(String[] args) {
        int a=7;
        int h=0;
        int k=0;
        int n=0;
        int[] arr=new int[]{2,3,1,2,4,3};
        for (int i=0;i<arr.length;i++){
            System.out.println("");
            int b=0;
            int c=0;
            for (int j=h;j<=i;j++){
                c=c+1;
                b+=arr[j];
                if (b>a){
                    break;
                }
                if (b==a){
                    k=c;
                    break;
                }
            }
            if (b>=a){
                h++;
            }
            if (b==a){
                if (n==0){
                    n=k;
                }else if (k<n){
                   n=k;
                }
                System.out.println(n);
            }
        }

    }
}
