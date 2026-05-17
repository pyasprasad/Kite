import java.util.Scanner;

public class SmallCapitalDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Small case");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Capital case");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("None");
        }
    }
}
