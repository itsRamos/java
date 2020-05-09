package domain;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class HelloWorld {

    public static void main(String[] args) {
        String fact = "Millionaire";
        // String[] splitString = fact.split("i");
        
        // String factPart = fact.substring(0,7);
        
        Pattern p = Pattern.compile("on(.*?)re");
        Matcher m = p.matcher(fact);
        
        while(m.find()) {
            System.out.println(m.group(1));
        }
        
    }

}
