public class PalindromeApp {

//    public static boolean isPalindrome(String word){
//       if(word.length()==1 || word.length() == 0)
//           return true;
//       else if(word.charAt(0) == word.charAt(word.length()-1))
//           return isPalindrome(word.substring(1,word.length()-1));
//       else
//           return false;
//
//    }

//    public static boolean isPalindrome(String word){
//        String newWord = "";
//
//        if(word.length() == 1 || word.length() == 0 )
//            return true;
//
//        for(int i = word.length()-1 ; i>=0 ;i--){
//            newWord += String.valueOf(word.charAt(i));
//        }
//
//        boolean result = true ? word.equals(newWord) : false;
//
//        return  result;
//    }

    public static boolean isPalindrome(String word){
        int i = 0, j = word.length()-1;
        boolean result = false;

        if(word.length() == 1 || word.length() == 0)
            return true;

        while(i<word.length()-1 && j>=0){
            if(word.charAt(i) != word.charAt(j))
                return false;

            if(i == j || j-i == 1){
                result = true;
                break;
            }

            i++;
            j--;
        }

       return result;
    }

    public static void main(String[] args){
        String word = "hannah";
        String word1 = "a";
        String word2 = "ade";
        String word3 = "";
        String word4 = "aba";


        boolean result = isPalindrome(word);
        boolean result1 = isPalindrome(word1);
        boolean result2 = isPalindrome(word2);
        boolean result3 = isPalindrome(word3);
        boolean result4 = isPalindrome(word4);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

//        System.out.println(word4.substring(1,1).length());
    }
}
