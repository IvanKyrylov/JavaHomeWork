package Task2;

import java.util.Arrays;

public class ArrayUnknownLength {

    private int[] mainArray;
    private int[] firstArray;
    private int[] secondArray;

    public ArrayUnknownLength() {
        mainArray = ArrayKnownLength.objectArrayKnownLength().getMainArray();
    }


    public void separationPositiveNegative() {
        firstArray = new int[mainArray.length];
        secondArray = new int[mainArray.length];
        for (int i = 0; i < mainArray.length; i++) {
            if (mainArray[i] > 0) firstArray[i] = mainArray[i];
            if (mainArray[i] < 0) secondArray[i] = mainArray[i];
        }
        System.out.println(Arrays.toString(mainArray));
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
    }
}
