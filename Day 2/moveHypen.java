// Write a method which take the string as parameter which contains - values then move all hipens at the beginning of the string..
import java.util.*;
public class moveHypen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String contains - : ");
        String str = sc.nextLine();
        sc.close();
        System.out.println(moveHypenToFront(str));

    }

    public static String moveHypenToFront(String str){
        StringBuilder sb = new StringBuilder();
        String ans = "";
        for(char ch : str.toCharArray()){
            if(ch == '-'){
                sb.append('-');
            } else {
                ans += ch;
            } 
        }

        return (sb.toString() + ans);
    }

}

