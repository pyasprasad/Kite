import java.util.Scanner;

public class IncrementOfSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i += 7) {
            System.out.println(i);
        }
    }
}
