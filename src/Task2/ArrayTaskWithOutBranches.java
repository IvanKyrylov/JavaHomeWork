package Task2;

import java.util.Random;

public class ArrayTaskWithOutBranches {
    private int[] ints;
    private int sum;
    Random random = new Random();

    public ArrayTaskWithOutBranches() {
        ints = new int[10];
        for (int i = 0; i < ints.length ; i++) {
            ints[i] = random.nextInt() % 100;
//            ints[i] = random.nextInt(25);
        }
    }

    public ArrayTaskWithOutBranches(int i) {
        ints = new int[i];
        for (i = 0; i < ints.length ; i++) {
            ints[i] = random.nextInt() % 100;
        }
    }

    public int[] getInts() {
        return ints;
    }

    public int getSum() {
        return sum;
    }

    public void show(){
        String s = "Normal: ";
        for (int i : ints) {
            s += i + "\t";
        }
        s += "\nReverse: ";

        for (int i = ints.length - 1; i >= 0; i--) {
            s += ints[i] + "\t";
        }
        System.out.println(s);

    }

    public void sum(){
        sum = 0;
        for (int i : ints) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

    }
}
