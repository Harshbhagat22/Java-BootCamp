import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String : ");
        String s1 = sc.nextLine();
        System.out.println("Enter the Second String : ");
        String s2 = sc.nextLine();
        sc.close();

        if(isAnagram(s1, s2)){
            System.out.println("The String are Anagram..");
        } else {
            System.out.println("The String are not Anagram...");
        }
    }

    public static boolean isAnagram(String s1, String s2){
            if(s1.length() != s2.length()){
                return false;
            }

            char arr1[] = s1.toCharArray();
            char arr2[] = s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1,arr2);
    }
}

