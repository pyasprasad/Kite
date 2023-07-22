import java.util.Scanner;

public class PrimeNumRange {

    protected static boolean isPrime(int n) {
        if (n == 1)
            return false;
        int count = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print("Prime Number is "+i+","+" ");
            }
        }
    }
}
