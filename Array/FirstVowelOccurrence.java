import java.util.Scanner;

public class FirstVowelOccurrence {

    public static int firstVowelOccurrence(char arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'i' || arr[i] == 'e' || arr[i] == 'o' || arr[i] == 'u') {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char arr[] = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        int ans = firstVowelOccurrence(arr);
        System.out.println(ans);
    }
}
