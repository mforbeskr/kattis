import java.util.Scanner;

public class quadrant {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int xValue = sc.nextInt();
        int yValue = sc.nextInt();

        if (xValue >= 0 && yValue >= 0) {
            System.out.println("1");
        }
        if (xValue <= 0 && yValue >= 0) {
            System.out.println("2");
        }
        if (xValue <= 0 && yValue <= 0) {
            System.out.println("3");
        }
        if (xValue >= 0 && yValue <= 0) {
            System.out.println("4");
        }
        sc.close();
    }
}
