import java.sql.SQLOutput;

public class StringObjects {
    public static void main(String[] args) {
//.substring(3,6) (3,object.charAt("x") .indexOf() .charAt() .toUpper() .toLower()
        String word = "Hello World";
        System.out.println( word );
        System.out.println(word.substring(0, word.indexOf(" ") ));
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
        System.out.println(word.charAt(0));
        System.out.println(word + ", Today is August 26.");

    }
}
