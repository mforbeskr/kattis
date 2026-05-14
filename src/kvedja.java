import java.util.Scanner;

public class kvedja
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    String sender = "Kvedja";

    String recipient = sc.nextLine();

    System.out.println(sender + ", \n" + recipient);
  }
}
