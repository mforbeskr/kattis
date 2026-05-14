import java.util.Scanner;

public class reduplikation
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    String letters = sc.nextLine();

    int times = sc.nextInt();

    for (int i = 0; i < times; i++)
    {
      System.out.print(letters);
    }
  }
}
