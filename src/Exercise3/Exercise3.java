package Exercise3;

public class Exercise3 {
    public static void main(String[] args){
        int[][] array = new int[5][5];
        int number = 1;
        int count = -1;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                array[i][j] = number++;
                count++;
                if (i==count){
                    count = -1;
                    break;
                }
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if (array[i][j]==0){
                    continue;
                }else{
                    System.out.print(array[i][j]+" ");
                }
            }
            System.out.print("\n");
        }

    }


}

