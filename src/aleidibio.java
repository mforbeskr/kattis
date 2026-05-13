import java.util.Scanner;

public class aleidibio
{
  public static void main(String[] args)
  {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    int ab = a + b;

    int c = sc.nextInt();

    int gives = c - ab;
    System.out.println(gives);
  }
}
