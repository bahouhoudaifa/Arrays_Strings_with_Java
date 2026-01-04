import java.util.Scanner;

public class LetterOccurrences {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nb_occurrences = new int[26];

        System.out.print("Enter a line of text (max. 100 characters): ");
        String ch = sc.nextLine();

        ch = ch.toUpperCase();

        for (int i = 0; i < ch.length(); i++) {
            char c = ch.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                nb_occurrences[c - 'A']++;
            }
        }

        System.out.println("\nThe string \"" + ch + "\" contains:");
        for (int i = 0; i < 26; i++) {
            if (nb_occurrences[i] > 0) {
                System.out.println(
                    nb_occurrences[i] + " occurrences of the letter '" + (char) ('A' + i) + "'"
                );
            }
        }
        sc.close();
    }
}
