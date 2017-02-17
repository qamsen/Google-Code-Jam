import java.lang.Math;

public class PracticeRound {

    public static void main(String[] main) {

        String word = "x";

        System.out.println(rightAnswers(word) % 1000000007);
    }

    public static long rightAnswers(String word) {

        if (word.length() == 1)
            return 1;

        int centerRepeat = repeatingLetters(word);
        int exponent = word.length() - centerRepeat - 2;
        long rightAnswers = (long) Math.pow(3, exponent);

        rightAnswers *= repeatingAtEnd(word);

        return rightAnswers;
    }

    public static int repeatingLetters(String word) {

        int totalRepeat = 0;

        // First and last repeats are handled differently.
        for (int i = 1; i < word.length() - 1; i++) {

            if (word.charAt(i) == word.charAt(i + 1))
                totalRepeat++;
        }

        return totalRepeat;
    }

    public static int repeatingAtEnd(String word) {

        int multiplier = 1;

        if (word.charAt(0) != word.charAt(1))
            multiplier *= 2;

        if (word.charAt(word.length() - 1) != word.charAt(word.length() - 2))
            multiplier *= 2;

        return multiplier;
    }

}
