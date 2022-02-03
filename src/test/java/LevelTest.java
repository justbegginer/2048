import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ExceptionUtils;

import static org.junit.jupiter.api.Assertions.*;

class LevelTest {

    @Test
    void levelTest() {
        Level level = new Level(4);
        level.incrementValue(0, 0);
        assertEquals(level.getValue(0, 0).getValue(), 2);
        level.makeNull(0, 0);
        assertEquals(level.getValue(0, 0).getValue(), 1);
    }
    @Test
    void levelExceptionTest() {
        Level level = new Level(4);
        assertThrows(WrongFieldException.class,() -> level.makeNull(0, -1));
        assertThrows(WrongFieldException.class,() -> level.incrementValue(0, 20));
        assertThrows(WrongFieldException.class,() -> level.incrementValue(4, 4));
    }
}