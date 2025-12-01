import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 2024-12-01
// 16:20 ~ 17:02

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        String[] str = new String[testCase];
        List<SerialNumber> numbers = new ArrayList<>();
        for (int i = 0; i < testCase; i++) {
            str[i] = br.readLine();

            int size = str[i].length();
            int sum = calculateSum(str[i]);

            numbers.add(new SerialNumber(str[i], size, sum));
        }

        Collections.sort(numbers);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++)
            sb.append(numbers.get(i).str).append("\n");

        System.out.println(sb.toString());
    }

    private static int calculateSum(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch))
                sum += ch - '0';
        }

        return sum;
    }
}

class SerialNumber implements Comparable<SerialNumber> {
    String str;
    int size;
    int sum;

    SerialNumber(String str, int size, int sum) {
        this.str = str;
        this.size = size;
        this.sum = sum;
    }

    @Override
    public int compareTo(SerialNumber other) {
        if (this.size != other.size)
            return this.size - other.size;
        else if (this.sum != other.sum)
            return this.sum - other.sum;
        return this.str.compareTo(other.str);
    }
}

