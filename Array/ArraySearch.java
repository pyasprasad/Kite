//https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1

package Array;

import java.util.Scanner;

public class ArraySearch {

    public static int arraySearch(int array[], int x){
        for(int i=0; i<array.length; i++){
            if(array[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i] = scanner.nextInt();
        }

        int x = scanner.nextInt();

        int result = arraySearch(array, x);
        System.out.println(result);
    }
}
