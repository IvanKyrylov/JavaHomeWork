package Task4.Figures;

public class Main {
    public static void main(String[] args) {
        Shape parallelogram = new Parallelogram(3,5);
        Shape ring = new Ring(2.5);
        Shape trapezium = new Trapezium(3, 5 ,10);
        Shape triangle = new Triangle(3,4,7);

        parallelogram.countSquare();
        ring.countSquare();
        trapezium.countSquare();
        triangle.countSquare();

        Shape abstractFigure = new Shape();
        abstractFigure.add(parallelogram);
        abstractFigure.add(ring);
        System.out.println("Sum square of parallelogram and ring = " + abstractFigure.square);
    }
}
