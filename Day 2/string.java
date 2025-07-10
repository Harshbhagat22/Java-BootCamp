// write a program top combination of the given string as follows
public class string {
    public static void main(String[] args) {
        String s = "Hello";
        for(int i = 1; i<s.length();i++){
            char ch = s.charAt(0);
            System.out.println(s.substring(i)+ch);
        }
    }
}



