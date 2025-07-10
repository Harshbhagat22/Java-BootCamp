import java.util.*;
public class fibonacci {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        sc.close();

        int t1 = 0;
        int t2 = 1;
        int result = 0;
        System.out.print(t1+" "+ t2+" ");
        for(int i = 2; i<n;i++){
            result = t1 + t2;
            t1 = t2;
            t2 = result;
            System.out.print(result+" ");
        }
        
    }
}
