package Exercise5;

public class Exercise5 {
    public static int[][] matrixAdd(int[][] matrix1, int[][] matrix2){
        int[][] matrix3 = new int[matrix1.length][matrix1[0].length];
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[0].length;j++){
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrix3;
    }

    public static void main(String[] args) {
        int[][] matrix1 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = i + j;
            }
        }
        int[][] matrix2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = i + j;
            }
        }

        int[][] matrix3 = matrixAdd(matrix1, matrix2);

        System.out.println("Matrix 1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("Matrix 2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("Matrix 3: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.print("\n");
        }

    }

}

