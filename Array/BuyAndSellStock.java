import java.util.Scanner;

public class BuyAndSellStock {

    public static int buyAndSellStock(int arr[]) {
        int buyingPrice = arr[0];
        int maxProfit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (buyingPrice < arr[i]) {
                int profit = arr[i] - buyingPrice;
                if (maxProfit < profit)
                    maxProfit = profit;
            } else {
                buyingPrice = arr[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = buyAndSellStock(arr);
        System.out.println(ans);
    }
}
