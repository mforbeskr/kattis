import java.util.Scanner;

public class twostones
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    int input = sc.nextInt();

    int even = input % 2;

    if (input == even)
    {
      System.out.println("Alice");
    }

  }
}
