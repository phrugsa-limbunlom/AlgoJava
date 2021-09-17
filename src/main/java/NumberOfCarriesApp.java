public class NumberOfCarriesApp {

    private static int findNumberOfCarries(int num1, int num2){

        int num1_length = String.valueOf(num1).length();
        int num2_length = String.valueOf(num2).length() ;

        int length = num1_length < num2_length ? num1_length  : num2_length;

        int carry = 0;

        for(int i = length-1 ; i >= 0 ; i--){

           int sumOfDigit = Character.getNumericValue(String.valueOf(num1).charAt(i)) + Character.getNumericValue(String.valueOf(num2).charAt(i)) + carry;

            if(sumOfDigit > 9){
                carry++;
            }
        }
        return  carry;
    }

    public static void main(String[] args){
        int number1 = 23;
        int number2 = 563;

        int numberOfCarries = findNumberOfCarries(number1,number2);

        System.out.println(numberOfCarries);
    }
}
