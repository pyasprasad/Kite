import java.util.Scanner;

public class SumlessThan150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if ((x + y + x) < 150) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
