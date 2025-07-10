// Write a method that accept the main string and substring as a parameter and count the how many times the substring occured in the main String..
import java.util.*;
public class substringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String : ");
        String s1 = sc.nextLine();
        System.out.println("Enter the SubString to Count : ");
        String s2 = sc.nextLine();
        sc.close();
        System.out.println("The count : "+countSubstring(s1, s2));

    }

    public static int countSubstring(String s1, String s2){
        int count = 0;
        for(int i = 0; i<s1.length();i++){
            if(s1.indexOf(s2) != -1){
                    count = count + 1;
                    break;
            }
        }

        for(int i = 0; i<s1.length();i++){
            if(s1.indexOf(s2) != -1){
                    count = count + 1;
                    break;
            }
        }

        return count;
    }
}

