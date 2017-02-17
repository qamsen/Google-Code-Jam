public class RoundE {

    public static void main(String[] args) {

        // Inputs
        int i = 1;
        int j = 1000000;
        String code = "BR";

        // Adjusts i
        i -= 1;

        // # of time String iterated through.
        int iter = (j - i) / code.length();

        int before = i % code.length();
        int after = j % code.length();

        int count = iter * blueInString(code);

        if (before != 0) {
            count += countForward(code, before);
        }

        if (after != 0) {
            count += countBackward(code, after);
        }

        System.out.println(count);
    }

    public static int blueInString(String code) {

        int totalBlue = 0;

        for (int i = 0; i < code.length(); i++) {

            if (code.charAt(i) == 'B')
                totalBlue++;
        }

        return totalBlue;
    }

    public static int countForward(String code, int i) {

        int count = 0;

        for (; i < code.length(); i++) {

            if (code.charAt(i) == 'B')
                count++;
        }

        return count;

    }

    public static int countBackward(String code, int j) {

        int count = 0;
        j--;

        for (; j >= 0; j--) {

            if (code.charAt(j) == 'B')
                count++;
        }

        return count;

    }

}
