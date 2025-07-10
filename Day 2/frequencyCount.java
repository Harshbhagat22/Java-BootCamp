// Write a method that accept one string and print the each character with frequency count ..
import java.util.*;
public class frequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        sc.close();
        countFrequency(str);
    }

    public static void countFrequency(String str){
        str = str.toLowerCase();
        int arr[] = new int[256];
        for(char ch : str.toCharArray()){
            arr[(int)ch]++;
        }

        for(int i = 0; i<arr.length;i++){
            if(arr[i]>=1){
                System.out.println((char)i+" "+ arr[i]);
            }
        }
    }
}
 