// write a program to print the prime digits of the numbers
import java.util.*;
public class Prime
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		StringBuilder sb = new StringBuilder();
		while(n != 0){
		    int digit = n % 10;
		    if(isPrime(digit)){
		       sb.append(digit+" ");
		    }
		    n  = n / 10;
		}

		System.out.println(sb.reverse().toString());
	}
	
	public static boolean isPrime(int n){
	    if(n<2){
	        return false;
	    }
	    
	    for(int i = 2; i<=Math.sqrt(n); i++){
	        if(n % i == 0){
	            return false;
	        }
	    }

	    return true;
	}

}

