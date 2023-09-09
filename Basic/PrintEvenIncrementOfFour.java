import java.util.Scanner;

public class PrintEvenIncrementOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 3; i < n; i += 4) {
            System.out.println(i);
        }
    }
}
