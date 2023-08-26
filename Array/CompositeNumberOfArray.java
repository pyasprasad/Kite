import java.util.Scanner;

public class CompositeNumberOfArray {

    public static boolean isComposite(int n) {
        int count = 0;
        if (n == 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 0)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (isComposite(arr[i])) {
                System.out.println(arr[i]);
            }
        }
    }
}
