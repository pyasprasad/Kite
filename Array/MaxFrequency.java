import java.util.HashMap;
import java.util.Scanner;

public class MaxFrequency {

    public static int maxFrequency(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int maxElement = 0;
        int maxfreq = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) > maxfreq) {
                maxfreq = map.get(arr[i]);
                maxElement = arr[i];
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxFrequency(arr));
    }
}
