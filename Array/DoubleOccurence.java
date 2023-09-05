import java.util.Scanner;

public class DoubleOccurence {

    public static void doubleOccurence(int arr[], int num[]) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[j] == arr[i])
                    count++;
            }
            if (count == 2)
                System.out.print(arr[i] + " ");
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
        doubleOccurence(arr, num);
    }
}
