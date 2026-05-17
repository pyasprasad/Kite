import java.util.Scanner;

public class InvertedRotatedNumPyramid {

    public static void invertedRotatedNumPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            int k = 1;
            for (int j = i; j <= n; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        invertedRotatedNumPyramid(n);
    }
}
