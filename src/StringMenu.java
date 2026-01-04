import java.util.Scanner;

public class StringMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = "";
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Enter the string");
            System.out.println("2. Display the string");
            System.out.println("3. Reverse the string");
            System.out.println("4. Number of words");
            System.out.println("0. Exit");
            System.out.print("Your chooise  : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter the string : ");
                    text = sc.nextLine();
                    pause(sc);
                    break;

                case 2:
                    System.out.println("Your string : " + text);
                    pause(sc);
                    break;

                case 3:
                    System.out.println("Inverted string : " + reverse(text));
                    pause(sc);
                    break;

                case 4:
                    System.out.println("Number of words : " + countWords(text));
                    pause(sc);
                    break;

                case 0:
                    System.out.println("End of programme.");
                    break;

                default:
                    System.out.println("Invalid choice !");
                    pause(sc);
            }

        } while (choice != 0);

        sc.close();
    }

    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static int countWords(String str) {

        if (str.trim().isEmpty())
            return 0;

        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void pause(Scanner sc) {
        System.out.println("\nPress any key to return to the menu...");
        sc.nextLine();
    }
}

