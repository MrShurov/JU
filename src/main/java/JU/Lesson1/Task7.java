package JU.Lesson1;

public class Task7 {

    public static void main(String[] args){
        String str = "While it seems unlikely that a party run from Berlin and dedicated to stopping. week Week";
        char character;
        String word = "";
        for (int i = 0; i < str.length(); i++){
            character = str.charAt(i);
            if (character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z') {
                word += character;
            } else if(!word.equals("")) {
                System.out.print(word.charAt(word.length() - 1));
                word = "";
            }
        }
        if(!word.equals("")) {
            System.out.print(word.charAt(word.length() - 1));
            word = "";
        }
    }
}
