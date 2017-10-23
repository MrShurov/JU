package JU.Lesson1;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args){
        String str = "213 fd3 77 -100 2j _2 02";
        int sum = 0;
        String strForMatcher;
        Pattern pattern = Pattern.compile("[^\\sa-zA-z]\\-?\\d+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            strForMatcher = matcher.group();
            sum += Integer.parseInt(strForMatcher);
        }
        System.out.println(sum);
    }
}
