import java.util.*;
public class palindrome {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(isPalindrome(n)){
            System.out.println(n+" is Palindrome number");
        } else {
            System.out.println(n+" is Not Palindrome number.");
        }

    }

    public static boolean isPalindrome(int n){
        if(n<9){
            return true;
        } else if(n < 0){
            return false;
        }

        String s = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        return s.equals(sb.reverse().toString());
    }
}
