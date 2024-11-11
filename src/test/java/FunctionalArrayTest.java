import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FunctionalArrayTest {
    @Test
    public void IndexThrowsErrorBeyondSize() {
        FunctionalArray array = new FunctionalArray(10);
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.get(10));
    }

    @Test
    public void IndexThrowsErrorWithNegativeIndex() {
        FunctionalArray array = new FunctionalArray(10);
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.get(-1));
    }

    @Test
    public void GetAndSet() {
        FunctionalArray array = new FunctionalArray(10);
        array.set(5, 7);
        array.set(4, 6);
        array.set(3, 8);
        Assertions.assertEquals(6, array.get(4));
    }
}
