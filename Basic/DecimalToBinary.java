import java.util.Scanner;

public class DecimalToBinary {

    public static int decimalToBinary(int n){
        int res=0;
        int power=1;
        while(n!=0){
            int ld=n%2;
            res=res+(ld*power);
            power*=10;
            n/=2;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=decimalToBinary(n);
        System.out.println(ans);
    }
}
