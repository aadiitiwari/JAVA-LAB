import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int evencount = 0;
        int oddcount = 0;

        System.out.println("Enter Ten numbers : ");
        for (int i = 0; i < 10; i++) {
            int number = obj.nextInt();
            if (number % 2 == 0)
                evencount++;
            else
                oddcount++;
        }

        System.out.println("even numbers are " + evencount);
        System.out.println("odd numbers are " + oddcount);

    }
}