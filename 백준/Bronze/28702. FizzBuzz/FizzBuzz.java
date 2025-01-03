import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 0;
        int len = 3;
        String[] str = new String[len];
        for (int i = 0; i < str.length; i++) {
            str[i] = br.readLine();
            if (str[i].charAt(0) != 'F' && str[i].charAt(0) != 'B') {
                result = Integer.parseInt(str[i]) + len;
            }
            len--;
        }



        if (result%3 == 0) {
            if (result%5 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        }
        else {
            if (result%5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(result);
        }
    }
}