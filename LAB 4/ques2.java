import java.util.Scanner;

class Plate {
    public int length, width;

    public Plate(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void display() {
        System.out.println("\nPlate dimensions:\n");
        System.out.println("Length: " + length + " units");
        System.out.println("Width: " + width + " units");
    }
}

class Box extends Plate {
    public int height;

    public Box(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    public void display() {
        super.display();
        System.out.println("\nBox dimensions:\n");
        System.out.println("Height: " + height + " units\n");
    }
}

class WoodBox extends Box {
    public double thickness;

    public WoodBox(int length, int width, int height, int thickness) {
        super(length, width, height);
        this.thickness = thickness;
    }

    public void displayDimensions() {
        super.display();
        System.out.println("\nWoodBox dimensions:\n");
        System.out.println("Thickness: " + thickness + " units\n");
    }
}

public class ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the plate: ");
        int plateLength = scanner.nextInt();

        System.out.print("Enter the width of the plate: ");
        int plateWidth = scanner.nextInt();

        System.out.print("Enter the height of the box: ");
        int boxHeight = scanner.nextInt();

        System.out.print("Enter the thickness of the wood box: ");
        int woodBoxThickness = scanner.nextInt();

        scanner.close();

        WoodBox woodBox = new WoodBox(plateLength, plateWidth, boxHeight, woodBoxThickness);
        woodBox.displayDimensions();
    }
}