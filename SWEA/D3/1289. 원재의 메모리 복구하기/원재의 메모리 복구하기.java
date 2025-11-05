
import java.util.Scanner;
import java.io.FileInputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        for (int i = 1; i <= testCase; i++) {
            String str = br.readLine();

            int ans = 0;
//            따로 없어도 될듯
//            if (str.equals("0000")) {
//                System.out.println("#" + i + " " + ans);
//                continue;
//            }

            char prev = '0';
            for (int j = 0; j < str.length(); j++) {
                char target = str.charAt(j);
                if (target != prev) {
                    prev = target;
                    ans++;
                }
            }

            System.out.println("#" + i + " " + ans);
        }
	}
}