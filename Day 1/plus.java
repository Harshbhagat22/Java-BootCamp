public class plus {
    public static void main(String[]args){
        for(int i = 0; i<7; i++){
            for(int j = 0; j<7;j++){
                if(i == 3 || j == 3){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}


/*
 * Write program to print the following pattern :
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 
 * 1
 * 0 0
 * 1 1 1
 * 0 0 0 0
 * 1 1 1 1 1
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */