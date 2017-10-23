package JU.Lesson1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args){
        String str = "While it seems unlikely that a party run from Berlin and dedicated to stopping. Week week";
        Pattern pattern = Pattern.compile("W+[a-zA-Z]*");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
