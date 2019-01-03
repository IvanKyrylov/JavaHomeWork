package Task3.Auto;

public class Body {
	private double length;
	private String type;
	private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Body{" +
                "length=" + length +
                ", type='" + type + '\'' +
                ", width=" + width +
                '}';
    }

    double increaseWidth(double width){
    	this.width =width;
    	width*=1.5;
    	return width;
    }
}
