import java.util.Scanner;

public class fifa
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    int startingYear = 2022;

    int improvementsSinceFrozen = sc.nextInt();
    int yearlyGameImprovements = sc.nextInt();

    int yearsSince = improvementsSinceFrozen/yearlyGameImprovements;

    System.out.println(startingYear+yearsSince);
  }
}
