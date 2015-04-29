

public class Card{

	//private enum Rank{
	
	//ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king;
	//}
	private int value;
	private String rank;
	private String suite;
	//enum Suite{
	
	//heart, spade, diamond, club;
	//}
	//public Card(Rank rank, int value, Suite suite)
	public Card(String rank, int value, String suite){
	
		this.rank = rank;
		this.value = value;
		this.suite = suite;
		}
//	public String getRank(){
	
	//		return rank;
	//		}
	//public void setRank(String rank){
	
	//this.rank = rank;
	//}
	//public int getValue(){
	
	//return value;
	//}
	//public void setValue(){
	
	//this.value = value;
	//}
	//public String getSuite(){
	
	//return suite;
	//}
	//public void setSuite(){
	
	//this.suite = suite;
	//}
	public int compare(Card otherCard){
	
		return value-otherCard.value;
	}
}
