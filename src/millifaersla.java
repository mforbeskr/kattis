import java.util.Scanner;

public class millifaersla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        if (first < second && first < third) {
            System.out.println("Monnei");
        }

        if (second < first && second < third) {
            System.out.println("Fjee");
        }

        if (third < second && third < first) {
            System.out.println("Dolladollabilljoll");
        }
    }
}
