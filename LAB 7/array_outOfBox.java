import java.util.Scanner;
public class array_outOfBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = {1, 2, 3, 4, 5};

        System.out.println("Enter the index of the required element (0 to 4):");
        try {
            int index = sc.nextInt();
            System.out.println("Element at index " + index + " is: " + myArray[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
            System.out.println("Please enter a valid index between 0 and 4.");
        }
    }
}




