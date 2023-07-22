import java.util.Scanner;

public class CompareArray {

    static boolean compareArr(int arr[], int num[]) { 
        if (arr.length != num.length)
            return false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num[i])
                return false;
        }
        return true;
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
        boolean ans = compareArr(arr, num);
        System.out.println(ans);
    }
}