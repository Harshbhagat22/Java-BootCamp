import java.util.*;
public class stringTokenizer {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String :");
    String str = sc.nextLine();
    String arr[] = str.split(" ");
    String result [] = sortAcending(arr);
    for(String name:result){
        System.out.print(name+" ");
    }
    sc.close();
   }
   // sorting ..
   public static String [] sortAcending(String arr[]){
    Arrays.sort(arr);
    return arr;
   }
}


