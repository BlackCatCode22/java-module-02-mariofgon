public class ReversedString {
    public static void main(String[] args) {
        String word =  "Hello";
        String drow = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            drow += word.charAt(i);
        }
        System.out.println(word);
        System.out.println(drow);
    }
}
