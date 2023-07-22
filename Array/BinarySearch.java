import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int arr[], int t) {
        int i = 0;
        int j = arr.length;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == t) {
                return mid;
            } else if (arr[mid] < t) {
                i++;
            } else {
                j--;
            }
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
        int t = sc.nextInt();
        int ans = binarySearch(arr, t);
        System.out.println(ans);
    }
}
