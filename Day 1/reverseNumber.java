// Write a program to accept any number from the user and print its reverse numbers.....
import java.util.*;
public class reverseNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println(reverseNum(n));
        sc.close();
    }

    public static int reverseNum(int n){
        int temp = n;
        int rev = 0;
        while(temp != 0){
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;

        }

        return rev;
    }
}

