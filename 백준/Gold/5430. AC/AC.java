import java.io.*;
import java.util.*;


// GPT
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String command = br.readLine();
            int count = Integer.parseInt(br.readLine());
            Deque<Integer> deque = new ArrayDeque<>(); // LinkedList 대신 ArrayDeque 사용

            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
            while (count-- > 0) {
                deque.add(Integer.parseInt(st.nextToken()));
            }

            boolean isReversed = false;
            boolean isError = false;

            for (char ch : command.toCharArray()) {
                if (ch == 'R') {
                    isReversed = !isReversed; // 뒤집기 상태만 토글
                } else if (ch == 'D') {
                    if (deque.isEmpty()) {
                        isError = true;
                        break;
                    }
                    if (isReversed) {
                        deque.pollLast(); // 뒤집힌 경우 뒤에서 삭제
                    } else {
                        deque.pollFirst(); // 일반 경우 앞에서 삭제
                    }
                }
            }

            if (isError) {
                bw.write("error\n");
            } else {
                bw.write(formatList(deque, isReversed) + "\n");
            }
        }

        bw.flush();
        bw.close();
    }

    // 리스트를 문제에서 요구하는 형식으로 변환하는 메서드
    static String formatList(Deque<Integer> deque, boolean isReversed) {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Integer> it = isReversed ? deque.descendingIterator() : deque.iterator();
        
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
}
