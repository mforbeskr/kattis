import java.util.Scanner;

public class dfyrirdreki {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            System.out.println("2");
        } else if (discriminant == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        sc.close();
    }
}
