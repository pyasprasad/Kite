import java.util.Scanner;

public class MultipleOf7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i += 7) {
            System.out.print(i + " ");
        }
    }
}
