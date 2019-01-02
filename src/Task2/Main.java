package Task2;

public class Main {

    public static void main(String[] args) {

//        ArrayTaskWithoutBranches arrayTaskWithoutBranches = new ArrayTaskWithoutBranches();
//        ArrayTaskWithoutBranches arrayTaskWithoutBranches1 = new ArrayTaskWithoutBranches(50);
//        arrayTaskWithoutBranches.sum();
//        arrayTaskWithoutBranches1.sum();
        ArrayTaskWithBranches arrayTaskWithBranches = new ArrayTaskWithBranches();
        ArrayTaskWithBranches arrayTaskWithBranches1 = new ArrayTaskWithBranches(20);
        arrayTaskWithBranches.show();
        arrayTaskWithBranches.sum();
        arrayTaskWithBranches.max();
        arrayTaskWithBranches.min();
        arrayTaskWithBranches.sumEvenElements();
        arrayTaskWithBranches.sumEvenElements(20, 30);
        arrayTaskWithBranches.maximumEvenElementsAndMinimumOdd();
        arrayTaskWithBranches.negativeInversion();

    }
}
