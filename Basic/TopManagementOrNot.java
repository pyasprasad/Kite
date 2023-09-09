import java.util.Scanner;

public class TopManagementOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exp = sc.nextInt();
        int sal = sc.nextInt();
        int rank = sc.nextInt();
        if (exp >= 10 || sal >= 50000 || rank >= 10)
            System.out.println("You are in top management");
        else
            System.out.println("You are not in top management");
    }
}
