package Task4.Figures;

public class Trapezium extends Shape{
    private double sizeA;
    private double sizeB;
    private double sizeH;

    public double getSizeA() {
        return sizeA;
    }

    public void setSizeA(double sizeA) {
        this.sizeA = sizeA;
        this.countSquare();
    }

    public double getSizeB() {
        return sizeB;
    }

    public void setSizeB(double sizeB) {
        this.sizeB = sizeB;
        this.countSquare();
    }

    public double getSizeH() {
        return sizeH;
    }

    public void setSizeH(double sizeH) {
        this.sizeH = sizeH;
        this.countSquare();
    }

    public Trapezium(double a, double b, double h){
        this.sizeA = a;
        this.sizeB = b;
        this.sizeH = h;
    }

    @Override
    public void countSquare(){
        this.square = (sizeA + sizeB) / 2 * sizeH;
    }
}
