import java.util.Scanner;

public class MaximumSumSubArrray {

    public static int maximumSumSubArrray(int arr[]) {
        int osm = arr[0];
        int csm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (csm > 0) {
                csm += arr[i];
            } else {
                csm = arr[i];
            }
            if (osm < csm)
                osm = csm;
        }
        return osm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = maximumSumSubArrray(arr);
        System.out.print(ans);
    }
}
