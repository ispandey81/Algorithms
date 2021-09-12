import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer binaryString = scanner.nextInt();
        System.out.println(convertDecimalToBinary(binaryString));
    }

    public static long convertDecimalToBinary(int decimalNumber) {
        int remainder = 0;
        StringBuilder stringBuilder = new StringBuilder();

        while (decimalNumber!=0) {
            remainder = decimalNumber % 2;
            decimalNumber /= 2;
            stringBuilder.append(remainder);
        }

        return Long.valueOf(stringBuilder.reverse().toString());
    }
}
