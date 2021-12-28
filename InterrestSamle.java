import java.util.Scanner;

public class InterrestSamle {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
    
        System.out.println("enter values :");

        int p=sc.nextInt();
        float r=sc.nextInt();
        float n=sc.nextInt();
        

        float si=(p*r*n)/100;

        System.out.println("result is : "+si);
    }
}
