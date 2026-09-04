import java.util.Scanner;

public class heysata {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char k = sc.next().charAt(0);
        String haystack = sc.next();

        if (haystack.indexOf(k) != -1) {
            System.out.println("Unnar fann hana!");
        } else {
            System.out.println("Unnar fann hana ekki!");
        }
        sc.close();
    }
}
