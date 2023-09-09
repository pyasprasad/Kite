import java.util.Scanner;

public class PrintFinalIncrementedSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int salary = sc.nextInt();
        int experience = sc.nextInt();
        if (age > 60 && salary > 20000 && experience > 20)
            salary += 5000;
        else if (age > 40 && salary > 15000 && experience > 10)
            salary += 2000;
        else if (age > 30 && salary > 10000 && experience > 5)
            salary += 1000;
        else
            salary += 500;
        System.out.println(salary);
    }
}
