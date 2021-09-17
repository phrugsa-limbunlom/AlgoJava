public class GcdApp {
    private static int[] dp;

    public static int calculateGCD(int num, int x){
        if(x == 0)
            return num;
        else
            return calculateGCD(x,num%x);
    }
    public static int findGCD(int[] arr, int i,int mod){
        if(i == 0)
            return calculateGCD(arr[i],mod);
        else if(dp[i] != 0)
            return dp[i];
        else
            return dp[i] = findGCD(arr,i-1, calculateGCD(arr[i],mod));
    }
    public static void main(String[] args){

        int[] arr = new int[]{15,9,3};

        int x = arr[arr.length-1]%arr[arr.length-2];

        dp = new int[arr.length];

        for(int k : dp){
            k = 0;
        }
        System.out.println(findGCD(arr,arr.length-1,x));

//        for(int i : arr){
//          x = calculateGCD(i,x);
//       }
//        System.out.println(x);

    }
}
