import java.util.Scanner;

public class ProductOfArray {

    protected static int productOfArr(int arr[]){
        int pro=1;
        for(int i=0;i<arr.length;i++){
            pro*=arr[i];
        }
        return pro;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=productOfArr(arr);
        System.out.println(ans);
    }
}
