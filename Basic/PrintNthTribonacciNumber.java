import java.util.Scanner;

public class PrintNthTribonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 1; i <= n; i++) {
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        System.out.println(a);
    }
}
