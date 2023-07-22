import java.util.*;
public class PrimeNumber {

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        int count=0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans=isPrime(n);
        System.out.println(ans);
    }
}