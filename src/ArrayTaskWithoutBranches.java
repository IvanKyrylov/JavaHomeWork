import java.util.Random;

public class ArrayTaskWithoutBranches {
    int[] ints = new int[10];
    Random random = new Random();

    public ArrayTaskWithoutBranches() {
        for (int i = 0; i < ints.length ; i++) {
            ints[i] = random.nextInt(10);
        }
    }

    public void show(){
        for (int i : ints) {
            System.out.print(i + "\t");
        }
    }

    public int consistent(){
        return 0;
    }
}
