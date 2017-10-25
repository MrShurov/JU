package JU.Lesson1;

public class NextLVLTask5 {

    public static void main(String[] args){
        String str = "While it seems unlikely that a party run from Berlin and dedicated to stopping. week Week";
        String word = "";
        char character;
        for(int i = 0;i < str.length(); i++){
            character = str.charAt(i);
            if (character == 'W' /*|| character == 'w'*/){
                do {
                    word += character;
                    if(i < str.length() - 1){
                        character = str.charAt(++i);
                    } else {
                        if (!word.equals("")){
                            System.out.println(word);
                            word = "";
                            character = '1';
                        }
                    }
                } while (character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z');
            }
            if (!word.equals("")){
                System.out.println(word);
                word = "";
            }
        }
    }
}
