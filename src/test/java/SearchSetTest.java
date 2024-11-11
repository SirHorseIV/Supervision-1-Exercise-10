import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SearchSetTest {
    @Test
    public void containsOnEmpty() {
        SearchSet set = new SearchSet();
        Assertions.assertFalse(set.contains(0));
    }

    @Test
    public void containsOnSet() {
        SearchSet set = new SearchSet();
        set.insert(1);
        set.insert(2);
        set.insert(3);
        Assertions.assertTrue(set.contains(2));
    }

    @Test
    public void getNumberElementsOnEmpty() {
        SearchSet set = new SearchSet();
        Assertions.assertEquals(0, set.getNumberElements());
    }

    @Test
    public void getNumberElementsOnSet() {
        SearchSet set = new SearchSet();
        set.insert(1);
        set.insert(2);
        set.insert(3);
        Assertions.assertEquals(3, set.getNumberElements());
    }
}
