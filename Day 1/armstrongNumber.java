 // Write a program to accept number from the user and check number is the armstrong number or not ...
import java.util.*;
public class armstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        if(isArmstrong(n)){
            System.out.println("The number is Armstrong number");
        } else {
            System.out.println("The number not Armstrong number");
        }
        sc.close();
    }

    public static boolean isArmstrong(int n){
        if(n < 10){
            return true;
        } else if(n < 0){
            return false;
        }

        int temp = n;
        int length = Integer.toString(n).length();
        int ans = 0;
        while(temp != 0){
            int digit = temp % 10;
            ans += (int) Math.pow(digit,length);
            temp = temp / 10;
        }   
        return ans == n;
    }
}
