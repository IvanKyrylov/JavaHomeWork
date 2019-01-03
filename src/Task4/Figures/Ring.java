package Task4.Figures;

public class Ring extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.countSquare();
    }

    public Ring(double rad){
        this.radius = rad;
    }

    @Override
    public void countSquare() {
        this.square = Math.PI * Math.pow(this.radius, 2);
    }
}
