// Write a program to count the digits divisible by the 3 or 5.
import java.util.*;
public class countDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        sc.close();
        int count = 0;
        while (n != 0) {
            int digit = n % 10;
            if(digit % 3 == 0 || digit % 5 == 0){
                count++;
            }
            n /= 10;
        }

        System.out.println("The Count of Digits divisible by 3 and 5 is "+ count);
    }
}
