import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int hour = sc.nextInt();
       int minute = sc.nextInt();

       if (minute >= 45)
           minute -= 45;
       else {
           hour--;
           minute += 15;
       }

       if (hour < 0)
           hour += 24;

        System.out.println(hour + " " + minute);
    }
}
