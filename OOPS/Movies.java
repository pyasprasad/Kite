public class Movies {

    public static class Batman {
        String name;
        Integer rating;
        Integer moneyCollections;
        Integer profit;
        String leadActor;
        String leadActress;

        public Batman(String name, Integer rating, Integer moneyCollections, Integer profit, String leadActor,
                String leadActress) {
            this.name = name;
            this.rating = rating;
            this.moneyCollections = moneyCollections;
            this.profit = profit;
            this.leadActor = leadActor;
            this.leadActress = leadActress;
        }

        Boolean checkHit(Integer rating) {
            if (rating > 5)
                return true;
            else
                return false;
        }

    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Batman Batman1 = new Batman("Batman 1", 8, 200000, 5000, "Rachel Gupta & Nikhil Chinapa", "Disha");
        Batman Batman2 = new Batman("Batman 2", 9, 500000, 8000, "Rannvijay Singha & Prince Narula", "Neha Dhupia");
        Batman Batman3 = new Batman("Batman 3", 4, 700000, 6000, "Rachel Gupta & Prince Narula", "Neha Dhupia");

        System.out.println(Batman1.checkHit(Batman1.rating));
        System.out.println(Batman2.checkHit(Batman2.rating));
        System.out.println(Batman3.checkHit(Batman3.rating));

    }
}