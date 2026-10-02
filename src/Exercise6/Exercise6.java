package Exercise6;

public class Exercise6 {
    public static int median(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[i]){
                    int k = array[j];
                    array[j] = array[i];
                    array[i] = k;
                }
            }
        }
        int mid = array[(array.length)/2];
        return mid;
    }

    public static void main(String[] args ){
        int[] array1={5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17} ;
        int[] array2 = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
        System.out.println(median(array1));
        System.out.println(median(array2));

    }
}
