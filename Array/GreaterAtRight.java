import java.util.Scanner;

public class GreaterAtRight {

    public static void greaterAtRight(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j])
                    count++;
            }
            System.out.print(count + " ");
            count = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        greaterAtRight(arr);
    }
}
