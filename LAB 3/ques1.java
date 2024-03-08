import java.util.Scanner;

class box {
    int length;
    int width;
    int height;

    public box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double volume() {
        return length * width * height;
    }

}

public class ques1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("ENTER THE LENGTH :");
        int length = obj.nextInt();

        System.out.println("Enter the width :");
        int width = obj.nextInt();

        System.out.println("ENTER the height :");
        int height = obj.nextInt();

        box v = new box(length, width, height);

        System.out.println("volume is :" + v.volume());

    }

}
