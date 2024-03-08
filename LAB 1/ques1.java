import java.util.Scanner;

public class ques1{
    public static void main(String args[]){
        Scanner obj = new Scanner (System.in);

        System.out.println("Enter your Name : ");
        String name = obj.nextLine();
        
        System.out.println("Enter your ROLL no : ");
        int rollNO = obj.nextInt();
        obj.nextLine();

        System.out.println("Enter your Section : ");
        String section = obj.nextLine();

        System.out.println("Enter your Branch : ");
        String branch = obj.nextLine();
        
        System.out.println("NAME : " + name);
        System.out.println("Roll No : "+ rollNO);
        System.out.println("Section : "+ section);
        System.out.println("Branch : "+ branch);
    } 
}