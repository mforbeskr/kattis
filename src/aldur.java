import java.util.Scanner;

public class aldur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int youngest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int age = sc.nextInt();
            youngest = Math.min(youngest, age);
        }
        System.out.println(youngest);

        sc.close();
    }
}
