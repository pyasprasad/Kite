import java.util.Scanner;

public class AddLastDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println((x % 10) + (y % 10));
    }
}
