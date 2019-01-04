package Task4.Array;

public class Element {

    private int anInt;
    private boolean aBoolean;
    private double aDouble;
    private String string;

    public Element() {
    }

    public Element(int anInt) {
        this.anInt = anInt;
    }

    public Element(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public Element(double aDouble) {
        this.aDouble = aDouble;
    }

    public Element(String string) {
        this.string = string;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public boolean getaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "Element{" +
                "anInt=" + anInt +
                ", aBoolean=" + aBoolean +
                ", aDouble=" + aDouble +
                ", string='" + string + '\'' +
                '}';
    }
}
