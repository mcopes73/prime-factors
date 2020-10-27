import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {
    @Test
    void test_parseInput_parsesNumber() {
        assertEquals(NumberUtils.parseInput("f40"), 40);
    }

    @Test
    void test_parseInput_malformed() {
        assertThrows(IllegalArgumentException.class, () -> NumberUtils.parseInput("40"));
    }

    @Test
    void test_getFactors() {
        assertEquals(NumberUtils.getFactors(12), Arrays.asList(1, 2, 3, 4, 6, 12));
    }

}