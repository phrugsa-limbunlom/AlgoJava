import java.lang.reflect.Array;
import java.util.Arrays;

public class LargeSmallSumApp {

    public static int calculateLargeSmallSum(int[] arr){

        int evenLength,oddLength;

        if(arr.length % 2 == 0){
            evenLength = arr.length/2;
            oddLength = arr.length/2;
        }else{
            evenLength = arr.length /2 + 1;
            oddLength = arr.length /2;
        }
        int[] numberOfEven = new int[evenLength];
        int[] numberOfOdd = new int[oddLength];

        int posEven = 0, posOdd = 0;
        for(int i = 0 ; i < arr.length ; i++){

            if(i == 0 || i % 2 == 0){

                numberOfEven[posEven++] = arr[i];

            }else{
                numberOfOdd[posOdd++] = arr[i];
            }
        }

        Arrays.sort(numberOfEven);
        Arrays.sort(numberOfOdd);

        System.out.println(Arrays.toString(numberOfEven));
        System.out.println(Arrays.toString(numberOfOdd));

        int secondLargestEven = numberOfEven[numberOfEven.length-2];
        int secondLargestOdd = numberOfOdd[numberOfOdd.length-2];

        int sum = secondLargestEven+secondLargestOdd;

        return sum;
    }
    public static void main(String[] args){
        int[] arr = new int[]{3, 2, 1, 7, 5};
        int largeSmallSum = calculateLargeSmallSum(arr);

        System.out.println(largeSmallSum);
    }
}
