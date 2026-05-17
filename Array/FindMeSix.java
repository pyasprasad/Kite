import java.util.Scanner;

public class FindMeSix {

    public static void findMeSix(int arr[], int num[]) {
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            for (int j = 0; j < num.length; j++) {
                if (num[j] == Math.abs(x)) {
                    System.out.print(arr[i] + " ");
                    break;
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
        int m = sc.nextInt();
        int num[] = new int[m];
        for (int j = 0; j < m; j++) {
            num[j] = sc.nextInt();
        }
        findMeSix(arr, num);
    }
}
