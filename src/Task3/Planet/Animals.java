package Task3.Planet;

public class Animals {
	private String name;
	private int speed;
	private int age;

    public String getters() {
        return ("\""+
                "Name = " + name +
                ", Speed = " + speed +" km/h"+
                ", Age = " + age +" year"+
                '\"');
    }

    public void setters(String name,int speed,int age) {
    	this.name = name;
    	this.speed = speed;
        this.age = age;
    }

    public static void main(String[] args) {
		Animals animal = new Animals();
 		animal.setters("Leopard",20,7);
 		System.out.println(animal.getters());
 		System.out.println("\"----------------------------------------------------\"");
 		Animals animal2 = new Animals();
 		animal2.setters("Bull",2,14);
 		System.out.println(animal2.getters());
    }
}
