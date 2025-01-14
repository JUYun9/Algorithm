import java.util.*;

class Solution {
    public String solution(String s) {
        
        String[] str = new String[s.length()];
        str = s.split(" ");
        
        int[] arr= new int[str.length];
        for (int i = 0; i < str.length; i++)
            arr[i] = Integer.parseInt(str[i]);
        
        Arrays.sort(arr);
        
        int max = arr[arr.length - 1];
        int min = arr[0];
        
        String result = "";
        result = String.valueOf(min) + " " + String.valueOf(max);
        return result;
    }
}