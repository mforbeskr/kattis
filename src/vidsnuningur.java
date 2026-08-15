import java.util.Scanner;

public class vidsnuningur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String output = new StringBuilder(sc.nextLine()).reverse().toString();

        System.out.println(output);
    }
}
