public class PrintCharacterAlternate {
    public static void main(String[] args) {
        char ch1='a';
        char ch2='C';
        for(int i=1;ch1<='z' || ch2<='Z';i++){
            if(i%2!=0){
                System.out.println(ch1);
                ch1+=4;
            }
            else{
                System.out.println(ch2);
                ch2+=4;
            }
        }
    }
}
