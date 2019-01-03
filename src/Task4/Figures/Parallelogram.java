package Task4.Figures;

public class Parallelogram extends Shape{
    private double sizeA;
    private double sizeB;

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

    public Parallelogram(double a, double b){
        this.sizeA = a;
        this.sizeB = b;
    }

    @Override
    public void countSquare(){
        this.square = sizeA * sizeB;
    }
}
