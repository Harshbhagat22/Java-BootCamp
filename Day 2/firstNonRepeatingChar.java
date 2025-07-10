// Write a Program to find the first non repeating character from the input string..
import java.util.*;
public class firstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        sc.close();
        System.out.println("The First Non repeating Character = "+ firstNonCharacter(str));

    }

    public static String firstNonCharacter(String str){
        String result = "";
        LinkedHashMap<Character,Integer>map = new LinkedHashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }

        for(Character key : map.keySet()){
            if(map.get(key)==1){
                result += key;
                return result;
            }
        }

        return "";
    }
}
