import java.util.Scanner;

public class AddIfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= '0' && ch <= '9') {
            System.out.println((ch - '0') + 100);
        } else {
            System.out.println("This is not a digit");
        }
    }
}
