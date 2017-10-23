package JU.Lesson1;

public class NextLVLTask4 {
    public static void main(String[] args) {
        String str = "300 213 fd 77 -100 cvv 2";
        String result = "";
        int sum = 0;
        char character;
        for (int i = 0; i < str.length(); i++) {
            character = str.charAt(i);
            if ('0' <= character && character <= '9' || character == '-') {
                result += character;
            } else if(!result.equals("")) {
                sum += Integer.parseInt(result);
                result = "";
            }
        }
        if (!result.equals("")){
            sum += Integer.parseInt(result);
        }
        System.out.println(sum);
    }
}
