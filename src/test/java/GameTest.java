import org.junit.Assert;
import org.junit.Test;

public class GameTest {

   @Test
   public void gameCanBePlayed() {

      Game game = new Game();

      Assert.assertTrue(game.play() != null);
   }
}
