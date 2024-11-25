import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCaseNum = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCaseNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int totalFloorNum = Integer.parseInt(st.nextToken());
            int totalRoomNum = Integer.parseInt(st.nextToken());
            int guestNum = Integer.parseInt(st.nextToken());

            int guestInFloor = guestNum % totalFloorNum;
            if (guestInFloor == 0)
                guestInFloor = totalFloorNum;

            int guestInRoom = (guestNum + totalFloorNum - 1) / totalFloorNum;
            
            String result = guestInFloor + String.format("%02d", guestInRoom);
            

            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
    }
}
