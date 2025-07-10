import java.util.*;
public class caesarCipher {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Message :");
         String msg = sc.nextLine();
         System.out.println("Enter the Shift Key : ");
         int key = sc.nextInt();
         sc.close();
        System.out.println(Decryption(msg, key));
    }

    public static String Decryption(String msg, int key){
       char arr[] = new char[52];
       int index = 0;
       for(char i = 'a'; i<='z';i++){
           arr[index++] = i;
       }
       for(char i = 'A'; i<='Z';i++){
           arr[index++] = i;
       }

       return "not done";
        
    }
}       
