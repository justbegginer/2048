import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    @Test
    void increment() {
        Field field = new Field();
        assertEquals(field.getValue(), 1);
        field.increment();
        assertEquals(field.getValue(), 2);
        field.increment();
        assertEquals(field.getValue(), 4);
    }

    @Test
    void makeNull() {
        Field field = new Field();
        field.increment();
        field.increment();
        field.makeNull();
        assertEquals(field.getValue(), 1);
    }
}