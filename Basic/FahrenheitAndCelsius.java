import java.util.Scanner;

public class FahrenheitAndCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fah = sc.nextDouble();
        double cel = ((fah - 32) * 5) / 9;
        System.out.println(cel);
    }
}
