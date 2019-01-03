package Task3.Auto;

public class Car {
	private String engine;
	private String suspension;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", suspension='" + suspension + '\'' +
                '}';
    }

    Helm helm = new Helm();
	Body body = new Body();
	Wheel wheel = new Wheel();
    
	String сhangeEngine(){
		this.engine = engine;
		engine ="RV8";
		return engine;
	}

	public static void main(String[] args) {
		Car car = new Car();
 		car.engine ="LR";
 		car.suspension = "Semi-independent back";
 		car.сhangeEngine();
 		System.out.println(car);
    }
}
