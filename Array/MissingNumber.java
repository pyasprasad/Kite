// https://leetcode.com/problems/missing-number/description/

package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MissingNumber {

    public static int missingNumber(int array[]) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }

        for (int i = 1; i <= array.length; i++) {
            if (map.containsKey(i) != true)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int ans = missingNumber(array);
        System.out.println(ans);
    }
}
