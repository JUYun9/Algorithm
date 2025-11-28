import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        StringTokenizer st;
        List<Axis> list = new ArrayList<>();
        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            list.add(new Axis(x, y));
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i).x + " " + list.get(i).y);

    }
}

class Axis implements Comparable<Axis> {
    int x;
    int y;

    public Axis(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Axis other) {
        if (this.x != other.x)
            return this.x - other.x;
        
        return this.y - other.y;
    }
}
