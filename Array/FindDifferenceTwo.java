import java.util.Scanner;

public class FindDifferenceTwo {

    public static void findDifferenceTwo(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if ((Math.abs(arr[i] - arr[j])) == k) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
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
        findDifferenceTwo(arr, k);
    }
}
