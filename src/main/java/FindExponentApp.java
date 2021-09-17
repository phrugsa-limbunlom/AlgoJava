public class FindExponentApp {
    public static int findExponent(int num1, int num2){

        int maxExpo = 0;

        for (int i = num1 ; i <= num2 ; i++){
            maxExpo = (int) Math.max(maxExpo,Math.log(i)/Math.log(2));
        }
        return maxExpo;
    }

    public static void main (String[] args){
        int num1 = 7;
        int num2 = 12;

       int maxExponent = findExponent(num1,num2);

       System.out.println(maxExponent);
    }
}
