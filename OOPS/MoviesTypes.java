class Movies {
    Integer rating;
    Integer moneyCollection;
    Integer profit;
    String leadActor;
    String leadActress;

    void displayRating() {
        System.out.println(rating);
        System.out.println("This is the function of movies class.");
    }
}

class CommercialMovies extends Movies {
    Integer views;
    Integer likes;

    public CommercialMovies(Integer rating, Integer moneyCollection, Integer profit, String leadActor,
            String leadActress, Integer views, Integer likes) {
        this.rating = rating;
        this.moneyCollection = moneyCollection;
        this.profit = profit;
        this.leadActor = leadActor;
        this.leadActress = leadActress;
        this.views = views;
        this.likes = likes;
    }

    void displayRating() {
        System.out.println(rating);
        System.out.println("This is the function of the commercial movies class.");
    }
}

public class MoviesTypes {
    public static void main(String[] args) {

        CommercialMovies londonDreams = new CommercialMovies(10, 9000000, 70000000, "Salman Khan", "Asin", 10000, 500);
        londonDreams.displayRating();
    }
}