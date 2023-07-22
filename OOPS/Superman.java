public class Superman {

    public static class Movies {
        String name;
        Integer rating;
        Integer moneyCollections;
        Integer profit;
        String leadActor;
        String leadActress;

        public Movies(Integer rating, Integer moneyCollections) {
            this.rating = rating;
            this.moneyCollections = moneyCollections;
            System.out.println("Stored rating and money.");
        }

        public Movies(Integer rating, Integer moneyCollections, Integer profit) {
            this.rating = rating;
            this.moneyCollections = moneyCollections;
            this.profit = profit;
            System.out.println("Stored rating, money, profit are given.");
        }

        public Movies(Integer rating, Integer moneyCollections, Integer profit, String leadActor) {
            this.rating = rating;
            this.moneyCollections = moneyCollections;
            this.profit = profit;
            this.leadActor = leadActor;
            System.out.println("Stored rating, money, profit, lead actors are given.");
        }
    }

    public static void main(String[] args) {
        Movies sMan1 = new Movies(8, 900000);
        Movies sMan2 = new Movies(8, 900000, 8000);
        Movies sMan3 = new Movies(8, 900000, 8000, "Ranveer Singh");

    }
}