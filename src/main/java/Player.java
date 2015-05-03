import java.util.ArrayList;
import java.util.Queue;

public class Player {

   private ArrayList<Card> cards = new ArrayList<Card>();

   public void addCardToTop(Card card){

      cards.add(card);
   }

   public void addCardToBottom(Card card){

   }

   public Card getTopCard() {

      int indexOfTopCard = cards.size() - 1;
      Card card = cards.get(indexOfTopCard);
      cards.remove(indexOfTopCard);
      return card;
   }

   // This method is only needed for the unit test
   public ArrayList<Card> getCards() {

      return cards;
   }
}
