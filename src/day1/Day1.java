package day1;

public class Day1 {
    public static void main(String[] args) {
        System.out.println(mergeAlternatively("abcdef", "pqrs"));
    }

    private static String mergeAlternatively(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int fptr = 0, sptr = 0;
        while(fptr != word1.length() || sptr != word2.length()){
            if(fptr == word1.length()){
                str.append(word2.charAt(sptr++));
            } else if(sptr == word2.length()){
                str.append(word1.charAt(fptr++));
            } else {
                if(str.length() % 2 == 0)
                    str.append(word1.charAt(fptr++));
                else
                    str.append(word2.charAt(sptr++));
            }
        
     }
        
        return str.toString();
    }

        
}
