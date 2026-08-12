import java.util.Scanner;

public class mclimb {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int rockAmount = sc.nextInt();
        int literCost = sc.nextInt();
        int year = sc.nextInt();

        if (rockAmount >= 0 && 1000 >= rockAmount
                && literCost >= 0 && 1000 >= literCost
                && year >= 1873 && 3000 >= year) {
            int total = rockAmount * literCost;
            System.out.println(total);
        } else {
            System.out.println("input invalid");
        }
    }
}
