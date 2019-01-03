package Task3.Auto;

public class Wheel {
	private String mark;
	private double loadCapacity;
	private double size;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "mark='" + mark + '\'' +
                ", loadCapacity=" + loadCapacity +
                ", size=" + size +
                '}';
    }
    
    double increaseSize(double size){
    	this.size =size;
    	size*=1.5;
    	return size;
    }
}
