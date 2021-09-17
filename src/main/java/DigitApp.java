public class DigitApp {
    private static int[] dp;
    public static int sumDigit(int[] n, int i){
        if(i == 0)
            return n[i];
        else if(dp[i] != 0)
            return dp[i];
        else
            return dp[i] = n[i] + sumDigit(n,i-1);
    }
    public static void main(String args[]){

        int[] arr = new int[]{1,2,3,4,5,6};

        dp = new int[arr.length];

        for(int k : dp){
            k = 0;
        }

        System.out.println(sumDigit(arr, arr.length-1));

    }
}
