import java.util.Arrays;

public class MedianSearchApp {

    private static boolean findMedianSearchByRecursive(int[] arr, int start, int end, int num){

        int median = (start+end)/2;

        if(start < end){
            if(num == arr[median]){
                return true;
            }else if(num < arr[median]){
                return findMedianSearchByRecursive(arr,start,median-1,num);
            }else{
                return findMedianSearchByRecursive(arr,median+1,end,num);
            }

        }else{
            if(arr[start] == num){
                return true;
            }
            return false;
        }

    }
    private static boolean findMedianSearch(int[] arr, int num){
        int n = arr.length;

        int start = 0;
        int end = n-1;

        int median;

        median = (start+end)/2;

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        while(start < end){

            if(arr[median] == num){
                return true;
            }
            else if( num < arr[median]){
                end = median-1;
                median = (start+end)/2;

            }else{
                start = median+1;
                median = (start+end)/2;
            }
        }
        if(arr[start] == num){
            return true;
        }
        return false;
    }

    public static void main(String[] args){

        int[] arr = new int[]{1,5,6,8,2,4,5,-9};
//
//        int num = -9;
//
//        int num2 = -23;
//
//        boolean isMedian = findMedianSearch(arr,num);
//
//        boolean isMedian2 = findMedianSearch(arr,num2);
//
//        System.out.println(isMedian);
//
//        System.out.println(isMedian2);

/////////////////////////////////////////////////////////////

        int num3 = -9;

        int num4 = -23;

        int start = 0;

        int end = arr.length-1;

        Arrays.sort(arr);

        boolean isMedian3 = findMedianSearchByRecursive(arr,start,end,num3);

        boolean isMedian4 = findMedianSearchByRecursive(arr,start,end,num4);

        System.out.println(isMedian3);

        System.out.println(isMedian4);


    }
}
