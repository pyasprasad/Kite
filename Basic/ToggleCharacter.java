import java.util.Scanner;

public class ToggleCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println((char) ((ch - 'a') + 'A'));
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println((char) ((ch - 'A') + 'a'));
        }
    }
}
