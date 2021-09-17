public class ReplaceCharApp {

    public static String replaceCharacter(String word, char ch1,char ch2){

        char[] characters = word.toCharArray();

        for(int i = 0 ; i < characters.length-1 ; i++){

           if(characters[i] == ch1){
              characters[i] = ch2;
           }
        }

        return new String(characters);
    }

    public static void main (String[] args){
        String word = "apple";
        char ch1 = 'a';
        char ch2 = 'p';

        String newWord = replaceCharacter(word,ch1,ch2);

        System.out.println(newWord);
    }
}
