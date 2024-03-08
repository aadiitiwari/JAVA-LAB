import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter how many numbers you want to enter :");
        int n = obj.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the numbers : ");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("The numbers in ascending order are :");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

}
