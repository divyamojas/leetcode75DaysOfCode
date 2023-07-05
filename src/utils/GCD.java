package utils;

public class GCD {

    public static int calcGCD(int a, int b){
        if(a < b){
            int temp = a;
            a = b;
            b = temp;
        }
        while (b !=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
