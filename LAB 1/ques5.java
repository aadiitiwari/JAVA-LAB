import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = obj.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = obj.nextLine();

        System.out.println(lastName + " " + firstName);
    }
}