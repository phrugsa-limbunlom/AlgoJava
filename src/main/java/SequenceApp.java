public class SequenceApp {
    public static Boolean isSequence(int[] n, int i){
        if(i == 0)
            return true;
        else if(n[i]-n[i-1] != 1)
            return false;
        else
            return isSequence(n,i-1);
    }

    public static void main(String args[]) {

        int[] arr1 = new int[]{ 1,2,3,4,5};
        int[] arr2 = new int[]{ 1,2,3,3,4};
        int[] arr3 = new int[]{ 1,2,3};
        int[] arr4 = new int[]{ 1,2,3,4,7,6,8,9};
        System.out.println(isSequence(arr1, arr1.length-1));
        System.out.println(isSequence(arr2, arr2.length-1));
        System.out.println(isSequence(arr3, arr3.length-1));
        System.out.println(isSequence(arr4, arr4.length-1));

    }
}
