import java.util.Scanner;

public class CheckCharacterstic {

    public static void checkCharacterstic(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                arr[i] = 1;
            else if (arr[i] < 0)
                arr[i] = -1;
            else
                arr[i] = 0;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        checkCharacterstic(arr);
    }
}
