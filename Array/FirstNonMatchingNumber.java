import java.util.Scanner;

public class FirstNonMatchingNumber {

    public static int firstNonMatchingNumber(int arr[], int num[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num[i])
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int ans = firstNonMatchingNumber(arr, num);
        System.out.println(ans);
    }
}
