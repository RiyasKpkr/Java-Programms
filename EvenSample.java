import java.util.Scanner;

public class EvenSample {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a range :");

        int num=sc.nextInt();

        System.out.println("number is :");


        for(int i=2; i<=num;i++){
            if (i%2==0){    
                System.out.println(i);
            }
        }

    }
}
