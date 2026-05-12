import java.util.Scanner;

public class ovissa
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    String message = sc.nextLine();
    int certaintyLevel = 0;

    for (int i = 0; i < message.length(); i++)
    {
      certaintyLevel++;
    }

    System.out.println(certaintyLevel);
  }
}
