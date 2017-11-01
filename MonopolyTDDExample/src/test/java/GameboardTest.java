import javafx.scene.control.Cell;
import junit.framework.TestCase;

public class GameboardTest extends TestCase {

    public GameboardTest(String name) {
        super(name);

    }

    public void testAddcell () {
        GameBoard gameboard = new GameBoard();
        assertEquals(0, gameboard.getCellNumber());
        Cell cell = new Cell();
        gameboard.addCell(cell);
        assertEquals(1,gameboard.getCellNumber());
    }
}
