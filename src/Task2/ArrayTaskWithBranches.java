package Task2;

public class ArrayTaskWithBranches extends ArrayTaskWithoutBranches {

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
        int max = 0;
        for (int i: ints) {
            max = Math.max(max, i);
        }
        System.out.println("Max: " + max);
    }

    public void min(){
        int min = 0;
        for (int i : ints) {
            min = Math.min(min, i);
        }
        System.out.println("Min: " + min);
        index(min);
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
        System.out.println("Sum Even Element: " + sum + ";\nQuantity: " + counter);
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
                " Even Element: " + sum + ";\nQuantity: " + counter);
    }

}