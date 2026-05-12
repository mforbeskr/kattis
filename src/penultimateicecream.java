import java.util.Scanner;

public class penultimateicecream
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    int amount = scanner.nextInt();
    int highest = 0;
    int secondHighest = 0;

    for (int i = 0; i < amount; i++)
    {
      int num = scanner.nextInt();

      if (num > highest)
      {
        secondHighest = highest;
        highest = num;
      }
      else if (num > secondHighest)
      {
        secondHighest = num;
      }
    }
    System.out.println(secondHighest);
  }
}
