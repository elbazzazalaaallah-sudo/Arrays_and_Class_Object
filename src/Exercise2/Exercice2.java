package Exercise2;

public class Exercice2 {
    public static void reverse(int[] arr){
        System.out.print("Array = [");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.print(arr[i]+"]");
            }else{
                System.out.print(arr[i]+", ");
            }
        }

        System.out.print("\nReversed array = [");
        for(int i=0;i<arr.length/2;i++){
            int k = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = k;
        }

        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.print(arr[i]+"]");
            }else{
                System.out.print(arr[i]+", ");
            }
        }

    }

    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5};
        reverse(array);
    }
}
