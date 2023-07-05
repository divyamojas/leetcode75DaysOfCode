package day1;

public class AltSol {
    public static String mergeAlternatively(String word1, String word2) {
        String temp = "";
        if(word2.length() > word1.length()){
            
            temp = word2.substring(word1.length(), word2.length());
        }
        if(word1.length() > word2.length())
        temp = word1.substring(word2.length(), word1.length());


        StringBuilder str = new StringBuilder();

        for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));
        }
        str.append(temp);
        return str.toString();
    }


}
