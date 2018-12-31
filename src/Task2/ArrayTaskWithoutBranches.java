package Task2;

import java.util.Random;

public class ArrayTaskWithoutBranches {
    int[] ints;
    Random random = new Random();

    public ArrayTaskWithoutBranches() {
        ints = new int[10];
        for (int i = 0; i < ints.length ; i++) {
            ints[i] = random.nextInt(10);
        }
    }

    public ArrayTaskWithoutBranches(int i) {
        ints = new int[i];
        for (i = 0; i < ints.length ; i++) {
            ints[i] = random.nextInt(10);
        }
    }

    public void show(){
        String s = "Normal: ";
        for (int i : ints) {
            s += i + "\t";
        }
        s += "\n" + "Reverse: ";

        for (int i = ints.length - 1; i >= 0; i--) {
            s += ints[i] + "\t";
        }
        System.out.println(s);

    }

    public void sum(){
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        show();
        System.out.println("Sum: " + sum);

    }
}
