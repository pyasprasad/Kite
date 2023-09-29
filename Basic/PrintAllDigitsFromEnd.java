import java.util.Scanner;

public class PrintAllDigitsFromEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            int ld = n % 10;
            System.out.println(ld);
            n /= 10;
        }
    }
}
