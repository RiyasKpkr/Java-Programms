import java.util.Scanner;

public class ReverseStarPrintingSample {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit:");

        int n=sc.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("x");
            }
            System.out.println();
        }

    }
}
