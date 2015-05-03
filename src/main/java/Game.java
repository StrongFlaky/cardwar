public class Game {

   private Deck deck = new Deck();

   private Player player1 = new Player();
   private Player player2 = new Player();

   public Player play() {

      deck.dealCards(player1, player2);

      int result = player1.getCards().get(0).compare(player2.getCards().get(0));

      if(result < 0){


      }

      return null;
   }

//   public static void main(String[] args) {
//
//   }
}
