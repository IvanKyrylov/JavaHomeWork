package Task2;

public class ArrayKnownLength {
    private int[] first, second;
    private int[] mainArray;
    private int max;
    private int min;
    private int indexMax;
    private int indexMin;

    private ArrayKnownLength() {
        first = new ArrayTaskWithOutBranches().getInts();
        second = new ArrayTaskWithOutBranches().getInts();
    }

    private ArrayKnownLength(int i) {
        first = new ArrayTaskWithOutBranches(i).getInts();
        second = new ArrayTaskWithOutBranches(i).getInts();
    }

    private ArrayKnownLength(int i, int j){
        first = new ArrayTaskWithOutBranches(i).getInts();
        second = new ArrayTaskWithOutBranches(j).getInts();
    }

    private ArrayKnownLength(int[] first, int[] second) {
        this.first = first;
        this.second = second;
    }

    public static ArrayKnownLength objectArrayKnownLength(){
        return new ArrayKnownLength();
    }

    public static ArrayKnownLength objectArrayKnownLength(int i){
        return new ArrayKnownLength(i);
    }

    public static ArrayKnownLength objectArrayKnownLength(int i, int j){
        if ((i >= 0 && i != 0) && (j >= 0 && j != 0)) return new ArrayKnownLength(i, j);
        else return new ArrayKnownLength();
    }

    public static ArrayKnownLength objectArrayKnownLength(int[] first, int[] second){
        return new ArrayKnownLength(first, second);
    }

    public void show(){
        String s = "First: ";

        for (int i = 0; i < first.length; i++) {
            s += first[i] + "\t";
        }

        s += "\nSecond: ";

        for (int i = 0; i < second.length; i++) {
            s += second[i] + "\t";
        }
        if (mainArray != null) {
            s += "\nMain Array: ";
            for (int i : mainArray) {
                s += i + "\t";
            }
        }else {
            s += "\nMain Array == NULL";
        }
        System.out.println(s);
    }

    public int[] sumPairedElement(){
        mainArray = new int[(first.length + second.length) / 2];
        for (int i = 0; i < first.length && i < second.length; i++) {
            mainArray[i] = first[i] + second[i];
        }
        show();
        return mainArray;
    }

    public int[] concatArray(){
        mainArray = new int[first.length + second.length];
        for (int i = 0; i < first.length; i++) mainArray[i] = first[i];
        for (int i = first.length, j = 0; i <= mainArray.length && j < second.length; i++, j++)
            mainArray[i] = second[j];
        show();
        return mainArray;
    }

    private void maxAndMin(){
        mainArray = concatArray();
        max = mainArray[0];
        min = mainArray[0];
        indexMax = 0;
        indexMin = 0;
        for (int i = 0; i < mainArray.length; i++) {
            if (max < mainArray[i]) {
                max = mainArray[i];
                indexMax = i;
            }
            if (min > mainArray[i]) {
                min = mainArray[i];
                indexMin = i;
            }
        }
    }

    public void swapMaxMin(){
        maxAndMin();
        System.out.println("Max: " + max + "\nMin:" + min);
        mainArray[indexMax] = min;
        mainArray[indexMin] = max;
        show();
    }

    public void deleteMaxAndMin(){

    }
}
