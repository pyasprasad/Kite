import java.util.Scanner;

public class PrintCharacterIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(str.length()>=4){
            System.out.println(str.charAt(3));
        }
        else{
            System.out.println("Small string");
        }
    }
}
