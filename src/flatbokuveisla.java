import java.util.Scanner;

public class flatbokuveisla
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    int slices = sc.nextInt();
    int persons = sc.nextInt();

    int leftoverSlices = slices % persons;

    System.out.println(leftoverSlices);

  }
}
