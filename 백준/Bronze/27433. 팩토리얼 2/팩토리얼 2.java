import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        long result = factorial(num);

        System.out.println(result);
    }

    private static long factorial(int target) {
        if (target == 0 || target == 1)
            return 1;
        return target * factorial(target-1);
    }
}
