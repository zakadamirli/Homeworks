package MentorDay09;

public class Task_3 {
    public static void main(String[] args) {
        int[][] matrixA={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] matrixB={
                {9,8,7},
                {6,5,4},
                {3,2,1}
        };
        int[][]sumMatrix=new int[3][3];
//sum the matrix A and matrix B
        for (int i=0;i<matrixA.length;i++){
            for (int j = 0; j <matrixB.length ; j++) {
                for (int k = 0; k <matrixA.length ; k++) {
                    sumMatrix[i][j]=matrixA[i][j]+matrixB[i][j];
                }
            }
        }
        //print sumMatrix
        System.out.println("Matrix A+Matrix B: ");
        for (int[] s:sumMatrix){
            for (int e:s){
                System.out.print(e+" ");
            }
            System.out.println();
        }
        System.out.println();
//-----------------------------------------------------------------------------------------
        //multiplication matrix
        int[][] matrixMulti =new int[3][3];
        for (int i=0;i<matrixA.length;i++){
            for (int j = 0; j <matrixB.length ; j++) {
                for (int k = 0; k <matrixA.length ; k++) {
                    matrixMulti[i][j]+=matrixA[i][k]*matrixB[k][j];
                }
            }
        }
//print multiplication matrix
        System.out.println("Matrix A * Matrix B");
        for (int[] s:matrixMulti) {
            for (int e:s){
                System.out.print(e+" ");
            }
            System.out.println();
        }
        System.out.println();

//-------------------------------------------------------------------------------------
        //transpose of matrix
        int[][] transposeOfMatrix=new int[3][3];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                transposeOfMatrix[i][j]=matrixA[j][i];
            }
        }

        //print transpose of matrix
        System.out.println("Transpose of Matrix A:");
        for (int[]s: transposeOfMatrix){
            for (int e:s){
                System.out.print(e+ " ");
            }
            System.out.println();
        }


    }
}
