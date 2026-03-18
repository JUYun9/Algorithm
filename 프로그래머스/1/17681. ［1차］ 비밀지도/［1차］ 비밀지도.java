class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        
        String[] binary1 = new String[arr1.length];
        String[] binary2 = new String[arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            binary1[i] = Integer.toBinaryString(arr1[i]);
            binary2[i] = Integer.toBinaryString(arr2[i]);
            
            while (binary1[i].length() < n)
                binary1[i] = "0" + binary1[i];
            
            while (binary2[i].length() < n)
                binary2[i] = "0" + binary2[i];
        }
        
        for (int i = 0; i < binary1.length; i++) {
            answer[i] = "";
            for (int j = 0; j < binary1[i].length(); j++) {
                char ch1 = binary1[i].charAt(j);
                char ch2 = binary2[i].charAt(j);
                if (ch1 == '0' && ch2 == '0')
                    answer[i] += " ";
                else
                    answer[i] += "#";
            }
        }
        
        return answer;
    }
}