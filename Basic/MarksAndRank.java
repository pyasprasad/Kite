import java.util.Scanner;

public class MarksAndRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int r = sc.nextInt();
        if (m < 20 || r > 100)
            System.out.println("Needs improvement");
        else if (m < 40 || r > 80)
            System.out.println("Concentrate");
        else if (m < 60 || r > 120)
            System.out.println("Needs to focus");
        else if (m > 100 || r < 10)
            System.out.println("Very good");
        else
            System.out.println("Bright Student");
    }
}
