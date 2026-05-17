import java.util.Scanner;

public class GreaterThanMe {

    public static void greaterThanMe(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
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
        greaterThanMe(arr);
    }
}
