public class matrix {
    public static void main(String []args){
        int matrix [][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        printMatrix(matrix);
    }

    public static void printMatrix(int a[][]){
        for(int nums[] : a){
            for(int num : nums){
                System.out.print(num+" ");
            }

            System.out.println();
        }
    }
}
