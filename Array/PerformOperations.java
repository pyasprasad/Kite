import java.util.Scanner;

public class PerformOperations {

    public static void performOperations(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                arr[i] += 1;
            else if (arr[i] < 0)
                arr[i] += 3;
            else
                arr[i] += 2;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        performOperations(arr);
    }
}
