// write a method that accept one string and convert that string into sentence case.
import java.util.*;
public class sentenceCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        sc.close();
        System.out.println(printSentenceCase(str));
    }

    public static String printSentenceCase(String str){
        if(str.isEmpty()){
            return " ";
        }

        String ans[] = str.split(" ");
        String res = "";

        for(int i = 0; i<ans.length;i++){   
            res += helper(ans[i]+" "); 
        }
        return res;
    }

    public static String helper(String str){
        String ans = "";
        ans += Character.toUpperCase(str.charAt(0));
        for(int i = 1; i<str.length();i++){
            ans += str.charAt(i);
        }
        return ans;
    }

}