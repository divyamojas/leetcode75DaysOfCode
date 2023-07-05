package utils;

public class Max {
    public static int max_el_arr(int [] arr){
        int max_el = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max_el) max_el = arr[i];
        }
        return max_el;
    }
}
