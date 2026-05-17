import java.util.Scanner;
import java.util.Stack;

public class TrappingRainWater {

    public static int trappingRainWater(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int lm[] = new int[arr.length];
        lm[0] = arr[0];
        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            while (st.size() != 0 && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                lm[i] = arr[i];
            } else {
                lm[i] = st.peek();
            }
            st.push(lm[i]);
        }
        st.clear();
        int rm[] = new int[arr.length];
        rm[arr.length - 1] = arr[arr.length - 1];
        st.push(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() != 0 && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                rm[i] = arr[i];
            } else {
                rm[i] = st.peek();
            }
            st.push(rm[i]);
        }
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            int maxBuilding = Math.min(lm[i], rm[i]);
            tp += maxBuilding - arr[i];
        }
        return tp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(trappingRainWater(arr));
    }
}
