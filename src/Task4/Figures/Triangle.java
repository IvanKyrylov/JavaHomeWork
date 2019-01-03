package Task4.Figures;

public class Triangle extends Shape{
    private double sizeA;
    private double sizeB;
    private double sizeC;

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

    public double getSizeC() {
        return sizeC;
    }

    public void setSizeC(double sizeC) {
        this.sizeC = sizeC;
        this.countSquare();
    }

    public Triangle(double a, double b, double c){
        this.sizeA = a;
        this.sizeB = b;
        this.sizeC = c;
    }

    @Override
    public void countSquare(){
        double p = (this.sizeA + this.sizeB + this.sizeC) / 2;
        this.square = Math.sqrt(p * (p - this.sizeA) * (p - this.sizeB) * (p - this.sizeC));
    }
}
