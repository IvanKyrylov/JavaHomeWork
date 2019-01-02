package Task2;

public class ArrayKnownLength {
    private int[] first, second;
    private int[] mainArray;

    private ArrayKnownLength() {
        first = new ArrayTaskWithOutBranches().getInts();
        second = new ArrayTaskWithOutBranches().getInts();
    }

    private ArrayKnownLength(int i) {
        first = new ArrayTaskWithOutBranches(i).getInts();
        second = new ArrayTaskWithOutBranches(i).getInts();
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
        System.out.println(s);
    }

    public int[] sumPairedElement(){
        mainArray = new int[(first.length + second.length) / 2];
        String s = "Main Array: ";
        for (int i = 0; i < first.length || i < second.length; i++) {
            mainArray[i] = first[i] + second[i];
            s += mainArray[i] + "\t";
        }
        show();
        System.out.println(s);
        return mainArray;
    }
}
