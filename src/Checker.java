import java.util.Arrays;

public class Checker {

    boolean check(int[] array){
        Arrays.sort(array);
        int value = array[0];
        int counter = 0;
        int varCounter = 0;
        for (int item : array) {
            if (item == value) {
                varCounter++;
            } else {
                if (varCounter > counter) counter = varCounter;
                value = item;
                varCounter = 1;
            }
        }
        if (varCounter > counter) counter = varCounter;
        return counter>(array.length/2);
    }
}
