import java.util.Scanner;

public class NthPowerOf10UsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = 1;
        int i = 1;
        while (i <= n) {
            power *= 10;
            i++;
        }
        System.out.println(power);
    }
}
