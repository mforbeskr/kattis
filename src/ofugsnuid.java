import java.util.ArrayList;
import java.util.Scanner;

public class ofugsnuid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] numberList = new int[n];

        for (int i = 0; i < n; i++) {
            numberList[i] = sc.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.println(numberList[i]);
        }
    }
}
