import java.util.Scanner;

public class MaleOrFemale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch == 'M' || ch == 'm') {
            System.out.println("You are a male");
        } else if (ch == 'F' || ch == 'f') {
            System.out.println("You are a female");
        } else {
            System.out.println("Type again");
        }
    }
}
