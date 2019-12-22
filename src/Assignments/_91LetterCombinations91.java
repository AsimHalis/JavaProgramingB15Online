package Assignments;

public class _91LetterCombinations91 {
    public static void main(String[] args) {
        String letter = "zyxwv";
        for (int x = 0; x < letter.length(); x++) {
            for (int i = 0; i < letter.length() ; i++) {
                System.out.print(letter.charAt(x));
                System.out.println(letter.charAt(i));
            }
        }
    }
}