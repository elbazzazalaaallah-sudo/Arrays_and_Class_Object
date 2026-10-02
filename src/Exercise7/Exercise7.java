package Exercise7;

public class Exercise7 {
    public static double stdev(int[] array){
        double  sum = 0;
        for(int i=0;i<array.length;i++){
            sum += array[i];
        }
        sum /= array.length;

        double sum1 = 0;
        for(int i=0;i<array.length;i++){
            sum1 += Math.pow(array[i]-sum,2);
        }

        double s = sum1/(array.length -1);

        return Math.pow(s,0.5);
    }

    public static void main(String[] args){
        int[] array = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        System.out.println(stdev(array));
    }

}
