import java.util.Scanner;

public class SecondLargestElement {

    public static int secondLargest(int arr[]) {
        int fMax = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > fMax) {
                sMax = fMax;
                fMax = arr[i];
            } else if (fMax > arr[i] && sMax < arr[i]) {
                sMax = arr[i];
            }
        }
        return sMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = secondLargest(arr);
        System.out.println(ans);
    }
}
