// Write a Program to find whether the Number is Strong number is not ....
import java.util.*;
public class strongNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        if(isStrongNumber(n)){
            System.out.println(n+" is Strong Number.");
        } else {
            System.out.println(n+" is not Strong Number.");
        }

        sc.close();
    }

    public static boolean isStrongNumber(int n){
        if(n == 1){
            return true;
        }

        int temp = n;
        int sum = 0;
        while(temp != 0){
            int digit = temp % 10;
            sum += factorial(digit);
            temp = temp / 10;
        }

        return sum == n;
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }
}

