public class DifferenceOfSumApp {
    public static int calculateDifferenceOfSum(int n, int m){

        int divisible = 0, nonDivisible = 0;

        for(int i = 1 ; i <= m ; i++){
            if (i % n == 0){
                divisible += i;
            }else{
                nonDivisible += i;
            }
        }

        int difference = Math.abs(divisible-nonDivisible);

        return difference;
    }
    public static void main(String[] args){
        int num1 = 4;
        int num2 = 20;

        int differenceOfSum = calculateDifferenceOfSum(num1,num2);

        System.out.println(differenceOfSum);
    }
}
