import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        try {
            int b=0;
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("ArithmeticException");
        }
    }
}
