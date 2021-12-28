import java.util.Scanner;

public class AverageSample {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter 1 number :");
        float num1=sc.nextInt();
        System.out.println("enter 2 number :");
        float num2=sc.nextInt();
        System.out.println("enter 3 number :");
        float num3=sc.nextInt();

        float avg = (num1+num2+num3)/3;

        System.out.println("result is "+avg);

    }
}
