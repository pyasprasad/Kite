import java.util.Scanner;

public class PrintOddFromNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
