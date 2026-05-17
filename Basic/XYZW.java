import java.util.Scanner;

public class XYZW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int w = sc.nextInt();
        if ((x * y) == (z * w)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
