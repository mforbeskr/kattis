import java.util.Scanner;

public class storafmaeli {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age % 10 == 0) {
            System.out.println("Jebb");
        } else {
            System.out.println("Neibb");
        }
        sc.close();
    }
}