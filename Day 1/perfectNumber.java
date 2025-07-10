// write a program that accept any number from the user and check number is perfect number or not ...
import java.util.*;
public class perfectNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        if(isPerfectNumber(n)){
                System.out.println("The number is Perfect Number.");
        } else {
            System.out.println("The number is not Perfect Number.");
        }

        sc.close();
    }

    public static boolean isPerfectNumber(int n){
        if(n <= 0){
            return false;
        }

        int sum = 0;
            for(int i = 1; i<n; i++){
                if(n%i==0){
                    sum += i;
                }
            }

        return sum == n;
    }
}


