import java.util.Scanner;

class rectangle {
    int length;
    int breadth;

    public rectangle (int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public int area()
    {
        return length*breadth;
    }

    public int perimeter()
    {
        return 2*(length*breadth);
    }

}

public class ques2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("ENTER THE LENGTH :");
        int length = obj.nextInt();

        System.out.println("Enter the breadth :");
        int breadth = obj.nextInt();

        rectangle r = new rectangle(length, breadth);

        System.out.println("THE AREA is :"+ r.area());
        System.out.println("THE perimeter is :" + r.perimeter());
    }
    
}
