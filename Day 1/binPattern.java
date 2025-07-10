// Write program to print the following pattern :
//  * 1
//  * 0 0
//  * 1 1 1
//  * 0 0 0 0
//  * 1 1 1 1 1
public class binPattern {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        for(int i = 0; i<5;i++){
            for(int j = 0; j<=i;j++){
                if(i%2==0){
                    System.out.print(y+" ");
                } else {
                    System.out.print(x+" ");
                }
            }
            
            System.out.println();
        }
    }
}
