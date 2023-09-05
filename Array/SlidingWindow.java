import java.util.Scanner;

public class SlidingWindow {

    public static void slidingWindow(int arr[], int k) {
        for (int i = 0; i < arr.length - k + 1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                if (arr[j] > max)
                    max = arr[j];
            }
            System.out.print(max + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        slidingWindow(arr, k);
    }
}
