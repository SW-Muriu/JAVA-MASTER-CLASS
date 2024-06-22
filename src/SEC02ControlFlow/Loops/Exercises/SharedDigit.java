package SEC02ControlFlow.Loops.Exercises;

public class SharedDigit {
    public static void main(String[] args) {

    }


    public static boolean hasSharedDigit(int start, int end) {
        if ((start > 99 || start < 10) || (end > 99 || end < 10)) return false;

        //Pull out the last digits
        int lastStartDigit = start % 10;
        int lastEndDigit = end % 10;

        //Pull out the first digits
        int firstStartDigit = start / 10;
        int firstEndDigit = end / 10;

        if (lastEndDigit == lastStartDigit) {
            return true;
        } else if (lastEndDigit == firstStartDigit) {
            return true;
        } else if (lastStartDigit == firstStartDigit) {
            return true;
        } else if (firstStartDigit == firstEndDigit) {
            return true;
        } else if (firstEndDigit == lastEndDigit) {
            return true;
        } else if (lastStartDigit == firstEndDigit) {
            return true;
        } else {
            return false;
        }
    }
}
