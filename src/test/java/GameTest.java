import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void start() {
        Game game = new Game(4);
        game.start();
    }
}