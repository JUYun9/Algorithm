import java.lang.*;
import java.io.*;
import java.util.Stack;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int k = 1; k <= t; k++) {
            Stack<Character> stk = new Stack<>();

            String str = br.readLine();
            if (str.length() == 1) {
                System.out.println("#" + k + " " + 1);
                continue;
            }

            for (int i = 0; i < str.length(); i++) {
                int centerIdx = str.length()/2;
                if (i == centerIdx && str.length()%2 == 1)
                        continue;
                else if (i < centerIdx)
                    stk.push(str.charAt(i));
                else {
                    if (stk.peek() == str.charAt(i))
                        stk.pop();
                    else {
                        System.out.println("#" + k + " " + 0);
                        break;
                    }
                }

                if (i == str.length()-1)
                    System.out.println("#" + k + " " + 1);
                
            }
        }
    }
}