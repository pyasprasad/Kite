import java.util.Scanner;

public class FirstNonMatchingNumberFromEnd {

    public static int firstNonMatchingNumberFromEnd(int arr[], int num[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
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
        int ans = firstNonMatchingNumberFromEnd(arr, num);
        System.out.println(ans);
    }
}
