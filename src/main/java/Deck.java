import java.util.ArrayList;
import java.util.Collections;

public class Deck {

   private ArrayList<Card> cards = new ArrayList<Card>();

   public Deck() {

      for (Suite suite : Suite.values()) {
         for (Rank rank : Rank.values()) {
            cards.add(new Card(rank, suite));
         }
      }

      Collections.shuffle(cards);
   }

   public Card getTopCard(){

      Card card = cards.get(0);
      cards.remove(0);
      return card;
   }

   public void dealCards(Player player1, Player player2) {

      for(int i = 0; i <= 12; i++){

         player1.addCardToTop(getTopCard());
         player2.addCardToTop(getTopCard());
      }
   }

   // This method is only needed for the unit test
   public ArrayList<Card> getCards() {

      return cards;
   }
}
