import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNum(int n) {
        int res = 0;
        while (n != 0) {
            int ld = n % 10;
            res = res * 10 + ld;
            n /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = reverseNum(n);
        System.out.println(ans);
    }
}
