import java.util.ArrayList;

public class Player
	{
	public void PlayerOne(){
		ArrayList<Card>player1 = new ArrayList<Card>();
		for(int number = 0; number < 13; number++){
			
			player1.add(new Card(Deck.cards.get(number)));
			}
		}
	}
