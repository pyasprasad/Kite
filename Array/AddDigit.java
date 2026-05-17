import java.util.Scanner;

public class AddDigit {

    public static int[] addDigit(int arr[], int carry) {
        for (int i = arr.length - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            arr[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry != 0) {
            int res[] = new int[arr.length + 1];
            res[0] = carry;
            return res;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int carry = sc.nextInt();
        int ans[] = addDigit(arr, carry);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
