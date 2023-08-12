import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeekFourExercises {
    public List<String> returnStringsInAlphabeticalOrder(List<String> inputMap) {
        return Arrays.asList("");
    }

    public List<String> returnStringsAsMapInGuaranteedNumericalKeyOrder(Map<Integer, String> myMap) {

        return Arrays.asList("");
    }

    @Test
    @Disabled
    public void returnListSortedAlphabetically() {
        List<String> myStrings = new ArrayList<String>(){{
            add("one");
            add("two");
            add("three");
            add("four");
            add("five");
        }};

        List<String> actual = returnStringsInAlphabeticalOrder(myStrings);

        assertEquals(Arrays.asList("five", "four", "one", "three", "two"), actual);
    }

    @Test
    @Disabled
    public void returnMapInAscendingKeyOrder() {
        Map<Integer, String> map = new HashMap<Integer,String>() {{
            put(3, "three");
            put(1, "one");
            put(5, "five");
            put(2, "two");
            put(4, "four");
        }};

        List<String> mapSortedByKey = returnStringsAsMapInGuaranteedNumericalKeyOrder(map);

        assertEquals(Arrays.asList("one", "two", "three", "four", "five"), mapSortedByKey);
    }
}
