// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DuplicatesInAnArray {

    public static List<Integer> duplicatesInArray(int array[]){
        Map<Integer, Integer>map = new HashMap<>();

        for(Integer x: array) map.put(x, map.getOrDefault(x, 0)+1);

        List<Integer> list = new ArrayList<>();

        for(Integer x: map.keySet()){
            if(map.get(x)>1) list.add(x);
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=scanner.nextInt();

        int array[] = new int[n];

        for(int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }

        List<Integer> ans = duplicatesInArray(array);
        
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println(" ");
    }
    
}
