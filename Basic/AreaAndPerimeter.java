import java.util.Scanner;

public class AreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(l * b);
        System.out.println(2 * (l + b));
    }
}
