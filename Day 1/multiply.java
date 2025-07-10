// Write a program to accept two numbers from the user and print the multiplication of that two numbers with using * operator
import java.util.*;
public class multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int x = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int y = sc.nextInt();
        sc.close();
        System.out.println("The Result = "+multiplyNumbers(x, y));

    }

    public static int multiplyNumbers(int x,int y){
        int sum = 0;
        for(int i = 0; i<Math.abs(y);i++){
            sum += x;
        }

        if(y < 0){
            sum = -sum;
        }

        return sum;
    }
}
