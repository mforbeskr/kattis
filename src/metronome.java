import java.util.Scanner;

public class metronome {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int songLength = sc.nextInt();

        double metronomeRevolutions = (double) songLength / 4;

        System.out.println(metronomeRevolutions);
    }
}
