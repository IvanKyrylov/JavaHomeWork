package Task3.Planet;

public class Animal {
	private String name;
	private int speed;
	private int age;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\""+
                "Name = " + name +
                ", Speed = " + speed +" km/h"+
                ", Age = " + age +" year"+
                '\"';
    }

    public static void main(String[] args) {
		Animal animal = new Animal();
 		animal.setName("Leopard");
 		animal.setSpeed(20);
 		animal.setAge(7);
 		System.out.println(animal);
 		System.out.println("\"----------------------------------------------------\"");
 		Animal animal2 = new Animal();
 		animal2.setName("Bull");
 		animal2.setSpeed(2);
 		animal2.setAge(14);
 		System.out.println(animal2);
    }
}
