// Write a program to accept the any decimal numbers form the users and print the its binary eqvivalent...
import java.util.*;
public class decToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(binConvert(n));

    }
      
    public static int binConvert(int n){
        String str = Integer.toBinaryString(n);
        return Integer.parseInt(str);
    }
}
