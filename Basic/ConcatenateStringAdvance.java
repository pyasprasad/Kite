import java.util.Scanner;

public class ConcatenateStringAdvance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String str = sc.next();
        if (st.length() > str.length()) {
            System.out.println(str + st + str);
        } else {
            System.out.println(st + str + st);
        }
    }
}
