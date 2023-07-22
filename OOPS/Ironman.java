public class Ironman {

    public static class Movies {
        String name;
        Integer rating;
        Integer moneyCollection;
        Integer profit;
        String actor;
        String actress;
        static String videoType;

        // static {
        // videoType = "movies";
        // }

        public Movies(Integer rating, Integer moneyCollection, Integer profit, String actor, String actress) {
            this.rating = rating;
            this.moneyCollection = moneyCollection;
            this.profit = profit;
            this.actor = actor;
            this.actress = actress;
        }
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Movies ironMan = new Movies(8, 900000, 8000, "Rachel Gupta", "Vaani");
        Movies.videoType = "movies";
        System.out.println(ironMan.videoType);
        System.out.println(Movies.videoType);
    }
}