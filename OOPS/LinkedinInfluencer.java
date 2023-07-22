import java.util.Scanner;

class Influencer{
    String name;
    Integer totalPosts;
    Integer totalReels;
    Boolean blueTick;
    Integer followers;
    Integer following;
    String category;
    Character gender;
    
    public Influencer(String name, Integer totalPosts, Integer totalReels, Boolean blueTick, Integer followers, Integer following, String category, Character gender){
        this.name=name;
        this.totalPosts=totalPosts;
        this.totalReels=totalReels;
        this.blueTick=blueTick;
        this.followers=followers;
        this.following=following;
        this.category=category;
        this.gender=gender;
    }
}
public class LinkedinInfluencer {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
        Integer n=sc.nextInt();
        
        Influencer arr[]=new Influencer[n];
        
        for(Integer i=0;i<n;i++){
            String name=sc.next();
            Integer totalPosts=sc.nextInt();
            Integer totalReels=sc.nextInt();
            Boolean blueTick=sc.nextBoolean();
            Integer followers=sc.nextInt();
            Integer following=sc.nextInt();
            String category=sc.next();
            Character gender=sc.next().charAt(0);
            
            Influencer influ=new Influencer(name, totalPosts, totalReels, blueTick, followers, following, category, gender);
            arr[i]=influ;
        }
        for(Integer i=0;i<n;i++){
            Influencer influ=arr[i];
            System.out.println(influ.name);
            System.out.println(influ.totalPosts);
            System.out.println(influ.totalReels);
            System.out.println(influ.blueTick);
            System.out.println(influ.followers);
            System.out.println(influ.following);
            System.out.println(influ.category);
            System.out.println(influ.gender);
        }
    }
}