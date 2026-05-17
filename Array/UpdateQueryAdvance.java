import java.util.Scanner;

public class UpdateQueryAdvance {

    public static void updateQueryAdvance(int arr[], int left, int right, int x) {
        for (int i = 0; i <= left; i++) {
            arr[i] += x;
        }
        for (int i = right; i < arr.length; i++) {
            arr[i] += x;
        }
        for (int z : arr) {
            System.out.print(z + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int left = sc.nextInt();
        int right = sc.nextInt();
        int x = sc.nextInt();
        updateQueryAdvance(arr, left, right, x);
    }
}
