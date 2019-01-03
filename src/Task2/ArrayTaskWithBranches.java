package Task2;


public class ArrayTaskWithBranches extends ArrayTaskWithOutBranches {
    private int[] ints = getInts();
    private int zeroValue = ints[0];
    private int max;
    private int min;

    public ArrayTaskWithBranches() {
        super();
    }

    public ArrayTaskWithBranches(int i) {
        super(i);
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void sum() {
        super.sum();
    }

    public void max(){
        max = zeroValue;
        for (int i: ints) {
            max = Math.max(max, i);
        }
        System.out.println("Max: " + max);
    }

/*    public int max(int[] ints){
        int max = ints[0];
        for (int i: ints) {
            max = Math.max(max, i);
        }
        return max;
    }*/

    public int getMax() {
        return max;
    }

    public void min(){
        min = zeroValue;
        for (int i : ints) {
            min = Math.min(min, i);
        }
        System.out.println("Min: " + min);
        index(min);
    }

/*    public int min(int[] ints){
        int min = ints[0];
        for (int i : ints) {
            min = Math.min(min, i);
        }
        System.out.println("Min: " + min);
        return min;
    }*/


    public int getMin() {
        return min;
    }

    public void index(int number){
        int index = 0;
        for (int i : ints) {
            if (i == number) {
                System.out.println("Index: " + index);
                break;
            }
            index++;
        }
    }

    public void sumEvenElements(){
        int sum = 0;
        int counter = 0;

        for (int i : ints) {
            if (i%2 == 0 && i !=0) {
                sum += i;
                counter++;
            }
        }
        System.out.println("Sum Even Element: " + sum + ";\n" + "Quantity: " + counter);
    }

    public void sumEvenElements(int start, int end){
        int sum = 0;
        int counter = 0;
        for (int i : ints) {
            if (i%2 == 0 && i !=0 && i >= start && i <= end) {
                sum += i;
                counter++;
            }
        }
        System.out.println("Sum " + start + " to " + end +
                " Even Element: " + sum + ";\n" + "Quantity: " + counter);
    }

    public void maximumEvenElementsAndMinimumOdd(){
        int max = zeroValue;
        int min = zeroValue;
        for (int i : ints) {
            if (i != 0 && (i > max && i%2 == 0)) {
                max = i;
            }
            if (i != 0 && (i < min && i%2 != 0)) {
                min = i;
            }
        }
        System.out.println("Maximum Event Element: " + max +
                ";\n" + "Minimum Odd Element: " + min + ";");
    }

    public void negativeInversion(){
                for (int i = 0; i < ints.length; i++) {
            if (ints[i] < 0) {
                ints[i] = Math.abs(ints[i]);
            }
        }
        show();
    }

    public void positiveIncNegativeDecr(){
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > 0) ints[i]++;
            if (ints[i] < 0) ints[i]--;
        }
        show();
    }

    public void numberMoreAverageArray(){
        double average = (double) getSum() / getInts().length;
        int counter = 0;
        for (int i : ints) {
            if (i >= average) counter++;
        }
        System.out.println("Array average: " + average + ";\n" +
                "Values greater than average: " + counter);
    }
}