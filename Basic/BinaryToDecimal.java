import java.util.Scanner;

public class BinaryToDecimal {

    public static int binaryToDecimal(int n){
        int res=0;
        int power=1;
        while(n!=0){
            int ld=n%10;
            res=res+(ld*power);
            power*=2;
            n/=10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=binaryToDecimal(n);
        System.out.println(ans);
    }
}
