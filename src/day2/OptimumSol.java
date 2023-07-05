package day2;

public class OptimumSol {
    public static String gcdOfStrings(String str1, String str2){
        String bigger = str1.length() > str2.length()? str1: str2;
        String smaller = str1.length() < str2.length()? str1: str2;
        System.out.println( bigger + " " + smaller);
        if(smaller.equals(bigger)) return smaller;
        if(!bigger.startsWith(smaller)) return "";

        System.out.println(bigger.substring(smaller.length()));

        return gcdOfStrings(bigger.substring(smaller.length()),smaller);
    }
}
