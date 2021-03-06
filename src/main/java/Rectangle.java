public class Rectangle extends Shape {

    private final int firstSide;
    private final int secondSide;

    public Rectangle() {
        System.out.println("Enter the length and width for the rectangle");
        this.firstSide = Utils.scanNumber();
        this.secondSide = Utils.scanNumber();
    }

    @Override
    public void calculateAndPrintArea() {
        System.out.println("Rectangle area " + getArea());
    }

    private int getArea() {
        return firstSide * secondSide;
    }
}