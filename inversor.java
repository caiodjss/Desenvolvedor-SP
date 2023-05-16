import java.util.Scanner;

public class inversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();

        String reversedString = inverterString(input);

        System.out.println("String invertida: " + reversedString);
    }

    public static String inverterString(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            // Trocar os caracteres de posição
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }

        return new String(chars);
    }
}