import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        sc.close();
        if(isPalindrome(str)){
            System.out.println(str+" is Palindrome.");
        } else {
            System.out.println(str+" is not Palindrome.");
        }

    }

    public static boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }

}

