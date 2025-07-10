 // Write a  methods that accept two string and swap that two Strings without using third object...
 import java.util.*;
public class stringSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        sc.close();
        swapString(str1, str2);

    }

    public static void swapString(String s1,String s2){
        s1 = s1 + s2;
        s2= s1.substring(0,s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        System.out.println(s1+" "+ s2);
    }
}
