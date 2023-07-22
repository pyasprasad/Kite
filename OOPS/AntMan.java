public class AntMan { 
    public static class Movies{
        String name;
        Integer rating;
        Integer moneyCollections;
        Integer profit;
        String actor;
        String actress;
        private Integer views;
        private Integer likes;
        
        Movies(String name, Integer rating, Integer moneyCollections, Integer profit, String actor, String actress, Integer views, Integer likes){
            this.name=name;
            this.rating=rating;
            this.moneyCollections=moneyCollections;
            this.profit=profit;
            this.actor=actor;
            this.actress=actress;
            this.views=views;
            this.likes=likes;
        }
        
        public Integer displayViews(){
            return views;
        }
        
        public Integer displayLikes(){
            return likes;
        }
        
        private Integer calculateGrade(Integer views, Integer likes){
            Integer finalGrade=10*likes + views;
            return finalGrade;
        }
        
        public Integer finalGrade(Integer views, Integer likes){
            Integer ans=calculateGrade(views, likes);
            return ans;
        }
    }
 
     public static void main(String[] args) {
         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         
         Movies antman=new Movies("antman 1", 8, 90000, 1000, "Rachel Gupta and Prince Narula", "Aarushi", 10000, 500);
         Integer views=antman.displayViews();
         Integer likes=antman.displayLikes();
         
         Integer ans=antman.finalGrade(views, likes);
         System.out.println(ans);
         
     }
 }