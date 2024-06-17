import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import day_1_1706.Dinglemouse;
import org.junit.jupiter.api.Test;

class ExampleTest {
    @Test
    void one() {
        assertArrayEquals(new int[]{1,1}, Dinglemouse.ownedCatAndDog(15,15));
    }

    @Test
    void two() {
        assertArrayEquals(new int[]{2,2}, Dinglemouse.ownedCatAndDog(24,24));
    }

    @Test
    void ten() {
        assertArrayEquals(new int[]{10,10}, Dinglemouse.ownedCatAndDog(56,64));
    }
}
