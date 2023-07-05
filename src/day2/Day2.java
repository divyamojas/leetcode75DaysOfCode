package day2;

import utils.GCD;

public class Day2 {
    static public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2 + str1)) return "";
        return str1.substring(0,GCD.calcGCD(str1.length(), str2.length()));
    }

    public static void main(String[] args) {
        System.out.println(OptimumSol.gcdOfStrings("ababab", "abab"));
    }
    
}
