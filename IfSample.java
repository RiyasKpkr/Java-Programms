import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class IfSample {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number :");

        int num=s.nextInt();

        if(num<0){
            System.out.println("number is Negative");
        }
        else{
            System.out.println("number is Positive");
        }

    }
}
