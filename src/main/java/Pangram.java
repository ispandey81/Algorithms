public class Pangram {

    public static boolean isPangram(String stringToCheck) {
        StringBuilder lowercaseLetters = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
        String lowercaseInput = stringToCheck.toLowerCase();
        for (int i =0; i< lowercaseInput.length(); i++) {
            if (Character.isLetter(stringToCheck.charAt(i))) {
                int foundIndex = lowercaseLetters.indexOf(String.valueOf(lowercaseInput.charAt(i)));
                if (foundIndex != -1) {
                    lowercaseLetters.deleteCharAt(foundIndex);
                }
            }
        }
        return lowercaseLetters.length() == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog"));
    }
}
