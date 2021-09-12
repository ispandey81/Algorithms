public class CaesarCipher {
    public static final String ALPHABET_LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    public static final String ALPHABET_UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encrypt(String plainText, int shiftKey)
    {
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++)
        {
            if (Character.isUpperCase(plainText.charAt(i))) {
                int charPosition = ALPHABET_UPPERCASE.indexOf(plainText.charAt(i));
                int keyVal = (shiftKey + charPosition) % 26;
                encryptedText.append(ALPHABET_UPPERCASE.charAt(keyVal));
            } else if (Character.isLowerCase(plainText.charAt(i))) {
                int charPosition = ALPHABET_LOWERCASE.indexOf(plainText.charAt(i));
                int keyVal = (shiftKey + charPosition) % 26;
                encryptedText.append(ALPHABET_LOWERCASE.charAt(keyVal));
            }
        }
        return encryptedText.toString();
    }

    public static String decrypt(String encryptedMessage, int offset) {
        return encrypt(encryptedMessage, 26-offset);
    }

    public static void main(String[] args) {
        System.out.println(encrypt("hEllO", 1));
        System.out.println(decrypt("iFmmP",1));
    }
}
