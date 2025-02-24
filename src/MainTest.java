import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("test when duplicates is exists string")
    void testRemoveDuplicates() {
        String expectedResult = "Jack,John,Nick";
        String actualResult = Main.removeDuplicates("Jack,John,Nick,John");
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    @DisplayName("there are no duplicates")
    void testRemoveDuplicates_noDuplicates() {
        String expectedResult = "Jack,John,Nick";
        String actualResult = Main.removeDuplicates("Jack,John,Nick");
        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    @DisplayName("input null")
    void testRemoveDuplicates_nullInput() {
        String expectedResult = "";
        String actualResult = Main.removeDuplicates(null);
        Assertions.assertEquals(expectedResult,actualResult);
    }
}