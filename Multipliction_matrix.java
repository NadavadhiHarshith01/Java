import java.util.*;

class Multipliction_matrix{

    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        int matrix1[][]=new int [3][3];
        int matrix2[][]=new int [3][3];
        int matrix3[][]=new int [3][3];

        System.out.println("Enter 3x3 Matrix elements");
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[0].length;j++){
                System.out.printf("Matrix1[%d][%d]",i,j);
                matrix1[i][j]=sc.nextInt();
            }
        }


        System.out.println("Enter 3x3 Matrix elements");
        for(int i=0;i<matrix2.length;i++){
            for(int j=0;j<matrix2[0].length;j++){
                System.out.printf("Matrix2[%d][%d]",i,j);
                matrix2[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matrix1");
        for(int x[]:matrix1){
            for(int y:x){
                System.out.print(y+" ");
            }
             System.out.print("\n");
        }

        System.out.println("Matrix2");
        for(int x[]:matrix2){
            for(int y:x){
                System.out.print(y+" ");
            }
             System.out.print("\n");
        }


        System.out.println("Multiplication");
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix2[0].length;j++){
                matrix3[i][j]=0;
                for(int k=0;k<matrix2.length;k++){
                    matrix3[i][j]=matrix3[i][j]+matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        

        System.out.println("Multiplication");
        for(int x[]:matrix3){
            for(int y:x){
                System.out.print(y+" ");
            }
             System.out.print("\n");
        }

    }

}