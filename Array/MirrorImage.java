import java.util.Scanner;

public class MirrorImage {

    public static void mirrorImage(int arr[], int num[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if ((arr[i] + num[j]) == 0) {
                    System.out.print(arr[i] + " ");
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
        for (int i = 0; i < m; i++) {
            num[i] = sc.nextInt();
        }
        mirrorImage(arr, num);
    }
}
