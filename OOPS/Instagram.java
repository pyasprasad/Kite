public class Instagram {

    public static class InstaInfluencers {
        String name;
        Integer totalPosts;
        Integer totalReels;
        String buleTick;
        Integer followers;
        Integer following;
        String category;
        Character gender;

        public InstaInfluencers(String name, Integer totalPosts, Integer totalReels, String buleTick, Integer followers,
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

        InstaInfluencers raftaarMusic = new InstaInfluencers("Raftaar", 340, 400, "Yes", 7, 200, "Rapper", 'M');
        InstaInfluencers rachelGupta = new InstaInfluencers("Rachel Gupta", 550, 350, "Yes", 15, 10, "Artist", 'M');
        InstaInfluencers nikhilChinapa = new InstaInfluencers("Nikhil Chinapa", 500, 220, "Yes", 5, 210, "VJ", 'M');
        InstaInfluencers baseeBob = new InstaInfluencers("Baseer", 500, 120, "No", 2, 230, "VJ", 'M');

        raftaarMusic.printDetails();
        rachelGupta.printDetails();
        nikhilChinapa.printDetails();
        baseeBob.printDetails();

    }
}