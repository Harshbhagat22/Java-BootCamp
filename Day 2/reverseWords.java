// Write a function  to accept one string reverse the words of each that string and same position..

import java.util.Scanner;

public class reverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        sc.close();
        System.out.println(reverseWord(s));
    }

    public static String reverseWord(String str){
        if(str.isEmpty()){
            return "";
        }

        String names [] = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<names.length;i++){
            StringBuilder sb1 = new StringBuilder(names[i]);
            sb.append(sb1.reverse().append(" "));
        }

        return sb.toString();
    }

    
}
