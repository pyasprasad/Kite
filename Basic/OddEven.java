import java.util.Scanner;

public class OddEven {

    public static boolean OddEven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans=OddEven(n);
        System.out.println(ans);
    }
}
