// Write a Menu Driven program for to perform the simple arithmetic operation ...
import java.util.*;
public class menuDriven {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {

        System.out.println("1. Addition \n2. Substraction\n3. Multiplication\n4. Division");
        System.out.println("Enter Your Choice :");
        int n = sc.nextInt();
        if( n>=5 ){
            System.out.println("Invalid Input");
            return;
        }
        System.out.println("Enter the Two Numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch(n){
            case 1:
            System.out.println("The Result : "+ add(a,b));
            break;
            case 2:
            System.out.println("The Result : "+ sub(a,b));
            break;
            case 3:
            System.out.println("The Result : "+ mul(a,b));
            break;
            case 4:
            if(b == 0){
                System.out.println("Cannot divide by Zero");
            } else 
            System.out.println("The Result : "+ div(a,b));
            break;

        }

        System.out.println("Enter the Choice 1/0  1 to continue 0 to exit");
        choice = sc.nextInt();
        sc.close();
    }while(choice == 1);
    System.out.println(" Exited successfully!.");  
}

    public static int add(int a , int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int mul(int a, int b){
        return a * b;
    }

    public static double div(int a, int b){
        return (double) a/b;
    }

}  
