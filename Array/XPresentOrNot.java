import java.util.Scanner;

public class XPresentOrNot {

    public static String xPresentOrNot(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return "True";
        }
        return "False";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        String ans = xPresentOrNot(arr, x);
        System.out.println(ans);
    }
}
