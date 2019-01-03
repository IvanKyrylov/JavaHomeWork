package Task3.Auto;

public class Helm {
	private double diameter;
	private String braid;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getBraid() {
        return braid;
    }

    public void setBraid(String braid) {
        this.braid = braid;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "diameter=" + diameter +
                ", braid='" + braid + '\'' +
                '}';
    }

    double increaseDiameter(double diameter){
    	this.diameter =diameter;
    	diameter*=1.5;
    	return diameter;
    }
}
