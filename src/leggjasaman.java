import java.util.Scanner;

public class leggjasaman
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    int arnarParked = sc.nextInt();
    int hannesParked = sc.nextInt();

    int totalParked = arnarParked + hannesParked;

    System.out.println(totalParked);
  }
}
