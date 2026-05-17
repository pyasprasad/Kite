import java.util.Scanner;

public class ProductOfElementsExceptItself {

    public static void productOfElementsExceptItself(int arr[]) {
        int pro = 1;
        for (int i = 0; i < arr.length; i++) {
            pro *= arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(pro / arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        productOfElementsExceptItself(arr);
    }
}