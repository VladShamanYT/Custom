import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;
import org.junit.Test;

public class SimpleClassTest {
    private ArrayList<Integer> arr;

    public SimpleClassTest(){
        arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
    }

    @Test
    public void maxTest() {
        int res = SimpleClass._max(arr);
        Assertions.assertEquals(4, res);
    }

    @Test
    public void minTest() {
        int res = SimpleClass._min(arr);
        Assertions.assertEquals(1, res);
    }

    @Test
    public void sumTest() {
        int res = SimpleClass._sum(arr);
        Assertions.assertEquals(10, res);
    }

    @Test
    public void multTest() {
        int res = SimpleClass._mult(arr);
        Assertions.assertEquals(24, res);
    }

    @Test
    public void throwTest() {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(Integer.MAX_VALUE);
        temp.add(Integer.MAX_VALUE);

        ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class, () -> {
            SimpleClass._sum(temp);
        });
        Assertions.assertEquals("integer overflow", thrown.getMessage());
    }
}
