package Exercise1;

public class Exercise1 {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("Element "+ i + "contents "+arr[i]);
        }
    }
    public static int[] sortIntegers(int[] arr){
        int[] n_arr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            n_arr[i] = arr[i];
        }

        for(int i=0;i<n_arr.length;i++){
            for(int j=i+1;j<n_arr.length;j++){
                if(n_arr[j]>n_arr[i]){
                    int k = n_arr[j];
                    n_arr[j] = n_arr[i];
                    n_arr[i] = k;
                }
            }
        }

        return n_arr;
    }

    public static void main(String[] args){
        int[] array = {106, 26, 81, 5, 15};
        printArray(array);
        int[] new_array = sortIntegers(array);
        for (int i=0;i<new_array.length;i++){
            System.out.print(new_array[i] + " ");
        }


    }
}
