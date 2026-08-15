import java.util.Scanner;

public class takkar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int trumpsButton = sc.nextInt();
        int kimsButton = sc.nextInt();

        if (trumpsButton > kimsButton) {
            System.out.println("MAGA!");
        }
        if (trumpsButton < kimsButton) {
            System.out.println("FAKE NEWS!");
        }
        if (trumpsButton == kimsButton) {
            System.out.println("WORLD WAR 3!");
        }
    }
}
