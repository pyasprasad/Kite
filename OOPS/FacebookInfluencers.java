import java.util.*;

public class FacebookInfluencers {

    public static class Influencer {
        String name;
        Integer totalPosts;
        Integer totalReels;
        String buleTick;
        Integer followers;
        Integer following;
        String category;
        Character gender;

        public Influencer(String name, Integer totalPosts, Integer totalReels, String buleTick, Integer followers,
                Integer following, String category, Character gender) {
            this.name = name;
            this.totalPosts = totalPosts;
            this.totalReels = totalReels;
            this.buleTick = buleTick;
            this.followers = followers;
            this.following = following;
            this.category = category;
            this.gender = gender;
        }

        void printDetails() {
            System.out.println(name);
            System.out.println(totalPosts);
            System.out.println(totalReels);
            System.out.println(buleTick);
            System.out.println(followers);
            System.out.println(following);
            System.out.println(category);
            System.out.println(gender);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Integer totalPosts = sc.nextInt();
        Integer totalReels = sc.nextInt();
        String buleTick = sc.next();
        Integer followers = sc.nextInt();
        Integer following = sc.nextInt();
        String category = sc.next();
        Character gender = sc.next().charAt(0);

        Influencer influencer = new Influencer(name, totalPosts, totalReels, buleTick, followers, following, category,
                gender);
        influencer.printDetails();
    }
}