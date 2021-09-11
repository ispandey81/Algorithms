import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binaryString = scanner.nextLine();
        System.out.println(convertBinaryToDecimal(binaryString));
    }

    public static int convertBinaryToDecimal(String binaryString) {
        StringBuilder stringBuilder = new StringBuilder(binaryString);
        String reversedString = stringBuilder.reverse().toString();
        int sum = 0;
        for (int i=0; i< reversedString.length(); i++) {
            sum += Character.getNumericValue(reversedString.charAt(i)) * Math.pow(2, i);
        }
        return sum;
    }
}
