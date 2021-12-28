import java.util.Scanner;

public class ElsefiLadderSample {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter 2 numbers :");  
        
        float num1=sc.nextInt();
        float num2=sc.nextInt();

        Scanner Choice=new Scanner(System.in);

        System.out.println("1.Addition\n2.mulltiplication\n3.substration\n4.division\nEnter your choice:");

        int choice=Choice.nextInt();

        if (choice==1) {
            Float result=num1+num2;
            System.out.println("result is :"+result);
        }
        else if (choice==2) {
            float result=num1*num2;
            System.out.println("result is :"+result);
        }
        else if (choice==3) {
            float result=num1-num2;
            System.out.println("result is :"+result);
        } 
        else if(choice==4){
            float result=num1/num2;
            System.out.println("result is :"+result);
        }
        else{
            System.out.println("your a pottan");
        }
        
    }
    
}
