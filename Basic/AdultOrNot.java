import java.util.Scanner;

public class AdultOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Below age");
        }
    }
}
