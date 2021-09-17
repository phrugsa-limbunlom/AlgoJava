import java.lang.reflect.Array;
import java.util.Arrays;

public class ProductPairApp {

    public static int calculateProductSmallestPair(int sum, int[] arr){

        int product = 0;

        if(arr.length < 2 || arr.length == 0){
            return -1;
        }

        Arrays.sort(arr);

        if(arr[0]+arr[1] <= sum){
            product = arr[0]*arr[1];
        }

        return product;
    }
    public static void main(String[] args){
        int sum = 1;
        int[] arr = new int[]{5, 2, 4, 3, 9, 7, 1};

        int product = calculateProductSmallestPair(sum,arr);

        System.out.println(product);

    }
}
