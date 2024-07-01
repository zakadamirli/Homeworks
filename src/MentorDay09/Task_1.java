package MentorDay09;

public class Task_1 {
    public static void main(String[] args) {
        char [][] matrix={
                {'A','B','C'},
                {'D','E','F'},
                {'G', 'H', 'I'}
        };
        System.out.println("Character Matrix: ");
        for (char[] value : matrix) {
            for (char c : value) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        System.out.println("Diagonal character 1: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i]+" ");
        }
        System.out.println();

        System.out.println("Diagonal character 2: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][matrix.length-i-1]+" ");
        }
    }
}
