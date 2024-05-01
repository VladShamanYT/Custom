import java.util.ArrayList;
import java.util.Collections;

public class SimpleClass {
    public static int _min(ArrayList<Integer> arr) {
        return Collections.min(arr);
    }

    public static int _max(ArrayList<Integer> arr) {
        return Collections.max(arr);
    }

    public static int _sum(ArrayList<Integer> arr) {
        int sum = 0;
        for (int element : arr) {
            try {
                sum = Math.addExact(sum, element);
            } catch (ArithmeticException e) {
                throw e;
            }
        }
        return sum;
    }

    public static int _mult(ArrayList<Integer> arr) {
        int mul = 1;
        for (int element : arr) {
            if (element == 0){
                return 0;
            }
            try {
                mul = Math.multiplyExact(mul, element);
            } catch (ArithmeticException e) {
                throw e;
            }
        }
        return mul;
    }
}