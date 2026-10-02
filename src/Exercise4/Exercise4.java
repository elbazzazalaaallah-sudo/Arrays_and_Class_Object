package Exercise4;

public class Exercise4 {
    public static void main(String[] args){
        int[][] matrix = new int[6][8];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                matrix[i][j] = i + j;
            }
        }

        System.out.println("Matrix before copy: ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }


        for(int i=0;i<6;i++){
            matrix[i][4] = matrix[i][0];
        }

        System.out.println("Matrix after copy: ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
