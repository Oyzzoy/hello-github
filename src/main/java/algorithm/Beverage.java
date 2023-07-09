package algorithm;

/**
 * @author shkstart
 * @create 2023-06-29 20:02
 */
public class Beverage {


    public static void main(String[] args) {
        double num=100;
        int print=11;
        double re=3.5;
        double i=0;

        while (num>11){
            num=(num/print);
            i=i+num;
            num=re*num;
        }
        System.out.println(i);
    }
}
