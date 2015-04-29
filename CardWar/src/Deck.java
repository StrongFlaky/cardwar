import java.util.ArrayList;
import java.util.Collections;
public class Deck{

	public ArrayList<Card> cards= new ArrayList<Card>();
	private String[] suiteNames = {"hearts", "spade", "club", "diamond"};
	private String[] rankNames = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
	public Deck(){
		
		
		for(int r = 1; r <= 13; r++){
		
			for(int s = 1; s <= 4; s++){
			
		    	cards.add(new Card(rankNames[r-1], r, suiteNames[s-1]));
			}
		}
		Collections.shuffle(cards);
		
	}
}
