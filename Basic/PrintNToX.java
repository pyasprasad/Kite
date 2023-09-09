import java.util.Scanner;

public class PrintNToX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        for (int i = n; i >= x; i--) {
            System.out.println(i);
        }
    }
}
