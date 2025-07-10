// Write a program to remove all vowels from the string ...
import java.util.*;
public class removeVowels {
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String str = sc.nextLine();
    sc.close();
    System.out.println(removeVowel(str));

    }

    public static String removeVowel(String str){
        String vowel = "AEIOUaeiou";
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(vowel.indexOf(ch) == -1){
                sb.append(ch);
            }
        }
        
        
        return sb.toString();
    }

}
