import java.util.Scanner;

public class DecrementOfK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = n; i >= 0; i -= k) {
            System.out.println(i);
        }
    }
}
