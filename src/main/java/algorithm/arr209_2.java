package algorithm;

/**
 * @author shkstart
 * @create 2023-06-14 22:12
 */
public class arr209_2 {
    public static void main(String[] args) {
        int [] arr=new int[]{3,4};
        int q=7;
        int num=0;
        int k=0;
        int g=0;
        int c=0;
        for (int i=k;;i++){
            i=k;
            if (i==arr.length){
                break;
            }
            g++;
            num=arr[i]+num;
            if (num>q){
                k=k+1;
                i=0;
                g=0;
                num=0;
               continue;
            }
            if (num==q){
                k=k+1;
                if (c==0){
                    c=g;
                }else if (g<c){
                    c=g;
                }
                i=0;
                g=0;
                num=0;
            }
        }
        System.out.println(c);
    }
}
