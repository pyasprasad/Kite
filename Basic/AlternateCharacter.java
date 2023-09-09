public class AlternateCharacter {
    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = 'B';
        int i = 1;
        while (i <= 26) {
            if (i % 2 != 0) {
                System.out.println(ch1);
                i++;
                ch1 += 2;
            } else {
                System.out.println(ch2);
                i++;
                ch2 += 2;
            }
        }
    }
}
