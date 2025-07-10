// write a program to accept two number from the user and check first number is divisible by second number or not without using mod operator...
import java.util.*;
public class testCases {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(isDivisible(num1, num2) == true){
            System.out.println("the first number is divisible by second number");
        } else {
            System.out.println("the first number is not divisible by second number");
        }


        sc.close();
    }

    public static boolean isDivisible(int num1, int num2){
        int n = num1 / num2;
        int remainder = num1 - (n * num2);      // dividend = divisior * quotient + remainder
        if(remainder == 0){
            return true;
        }
        return false;
    
    } 

}


