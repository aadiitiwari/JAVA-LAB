import java.util.Scanner;

public class ques2 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\nMenu:");
            System.out.println("1. Change the case of the string");
            System.out.println("2. Reverse the string");
            System.out.println("3. Compare two strings");
            System.out.println("4. Insert one string into another string");
            System.out.println("5. Convert the string to upper case and lower case");
            System.out.println("6. Check whether a character is present in the string");
            System.out.println("7. Check whether the string is palindrome");
            System.out.println("8. Count words, vowels, and consonants in the string");
            System.out.println("0. Exit");

            System.out.println("Enter your choice");
            choice =sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                //Change the case of the string
                System.out.println("Enter the string : ");
                String str1 =sc.nextLine();
                String uppercaseString =str1.toUpperCase();
                String lowercaseString =str1.toLowerCase();
                System.out.println("Original string: " + str1);
                System.out.println("The string in Upper case is: " + uppercaseString);
                System.out.println("The string in Lower case is: " + lowercaseString);
                break;

                case 2:
                //Reverse the string
                System.out.println("Enter the string : ");
                String str2 =sc.nextLine();
                String reversedString = new StringBuilder(str2).reverse().toString();
                System.out.println("The string after reversing is " + reversedString);
                break;
                
                case 3:
                // Compare two strings
                System.out.println("Enter the first string : ");
                String firstString =sc.nextLine();
                System.out.println("Enter the second string : ");
                String secondString =sc.nextLine();
                int difference = firstString.compareTo(secondString);
                System.out.println("The difference between ASCII values is " + difference);
                break;

                case 4:
                // Insert one string into another string
                System.out.println("Enter the first string : ");
                String firstStr =sc.nextLine();
                System.out.print("Enter the string to be inserted into the first string: ");
                String insertString =sc.nextLine();
                String concatenatedString = firstStr + "" +insertString;
                System.out.println("The string after insertion is: " + concatenatedString);

                break;

                case 0:
                System.out.println("Exiting the program. Goodbye!");
                break;

                default:
                System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }

        }while (choice != 0);
    }
}