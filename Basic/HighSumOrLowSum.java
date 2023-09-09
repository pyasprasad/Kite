import java.util.Scanner;

public class HighSumOrLowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if ((x + y) >= 100) {
            System.out.println("High Sum");
        } else {
            System.out.println("Low Sum");
        }
    }
}
