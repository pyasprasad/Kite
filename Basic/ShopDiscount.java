import java.util.Scanner;

public class ShopDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int price = n * 100;
        if (price > 1000) {
            int discount = (price * 10) / 100;
            price = price - discount;
        }
        System.out.println(price);
    }
}
