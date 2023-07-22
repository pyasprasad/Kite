import java.util.*;

public class InbuildSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Arrays.sort(arr);
        Arrays.sort(arr,2,5);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
