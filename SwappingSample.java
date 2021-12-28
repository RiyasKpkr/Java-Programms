import java.util.Scanner;

public class SwappingSample {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter 2 number:");

        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("Swapping is :"+num1+" "+num2);



    }
}
