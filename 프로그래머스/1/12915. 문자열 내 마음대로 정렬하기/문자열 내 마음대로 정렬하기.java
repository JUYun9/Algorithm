class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        int k = 0;
        char[] arr = new char[strings.length];
        for (int i = 0; i < strings.length; i++)
            arr[k++] = strings[i].charAt(n);
        
        for (int i = k-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    char tmp1 = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp1;
                    
                    String tmp2 = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1] = tmp2;
                } else if (arr[j] == arr[j+1]) {
                    if (strings[j].compareTo(strings[j+1]) > 0) {
                        String tmp3 = strings[j];
                        strings[j] = strings[j+1];
                        strings[j+1] = tmp3;
                    }
                }
            }
        }
        
        return strings;
    }
}