import java.util.Scanner;

public class GreaterThan100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 100) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
