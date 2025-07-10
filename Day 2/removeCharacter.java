// Write a program to remove the a specific character from the string..
import java.util.*;
public class removeCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String str = sc.nextLine();
    System.out.println("Enter the Character to Remove : ");
    char ch = sc.next().charAt(0);
    System.out.println(replaceChar(str, ch));
    sc.close();
    }

    public static String replaceChar(String str,char ch1){
        StringBuilder sb = new StringBuilder();
        str = str.toLowerCase();
        for(char ch:str.toCharArray()){
            if(ch == ch1){
                sb.append("");
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

}
