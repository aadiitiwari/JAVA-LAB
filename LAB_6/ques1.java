import Marketing.Sales;
import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the employee id and employee name: ");
        int empId = scanner.nextInt();
        String empName = scanner.next();
        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();

        Sales salesPerson = new Sales(empId, empName, basicSalary);

        System.out.println("The emp id of the employee is " + salesPerson.empid);
        System.out.println("The total earning is " + (salesPerson.earnings() + salesPerson.tallowance()));
    }
}