import java.util.Scanner;
import sun.jvm.hotspot.oops.java_lang_Class;
class sheet {
    public int length;
    public int breadth;

    public sheet(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return length * breadth;
    }

}

class box extends sheet {
    public int height;

    public box (int length,int breadth,int height) {
        super(length,breadth);
        this.height = height;
    }

    int volume() {
        return length * breadth * height;
    }

}

public class ques1 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("ENter length : ");
        int length = obj.nextInt();
        System.out.println("ENter breadth : ");
        int breadth = obj.nextInt();
        System.out.println("ENter height : ");
        int height = obj.nextInt();

        sheet sheet_cost = new sheet(length,breadth);
        box box_cost = new box(length,breadth,height);

        System.out.println("COST oF SHEET : " + 40 * (sheet_cost.area()));
        System.out.println("COST oF box : " + 60 * (box_cost.volume()));
    }
}
