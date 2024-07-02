import java.util.Scanner;

public class UnicodeParsing {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a Unicode escape sequence
        System.out.println("Enter a Unicode escape sequence (e.g., \\u0041):");
        String unicodeInput = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Convert the Unicode escape sequence to a character
        char result = convertUnicodeToChar(unicodeInput);

    }

    public static char convertUnicodeToChar(String unicodeInput) {
        // Remove the leading backslash and 'u'
        String hexValue = unicodeInput.substring(2);

        // Convert hex value to a character
        char out = (char)Integer.parseInt(hexValue, 16);
        return out;

        
    }
}
