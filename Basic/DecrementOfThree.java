import java.util.Scanner;

public class DecrementOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i -= 3) {
            System.out.println(i);
        }
    }
}
