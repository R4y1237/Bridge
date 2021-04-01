
/**
 * 
 */

/**
 * @author Ray and Zachary
 *ICS4UO with Ms. Krasteva
 *This code will display and find the winner of a bridge game
 */
import java.util.*;

public class Practice2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// d = Diamond, c = clubs, h = hearts, s = spades
		String deckArr[] = { "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "TD", "JD", "QD", "KD", "AD", "2C", "3C",
				"4C", "5C", "6C", "7C", "8C", "9C", "TC", "JC", "QC", "KC", "AC", "2H", "3H", "4H", "5H", "6H", "7H",
				"8H", "9H", "TH", "JH", "QH", "KH", "AH", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "TS", "JS",
				"QS", "KS", "AS" };
		ArrayList <String> deck = new ArrayList <String>(52);
		ArrayList <String> p1 = new ArrayList <String>(13);
		ArrayList <String> p2 = new ArrayList <String>(13);
		ArrayList <String> p3 = new ArrayList <String>(13);
		ArrayList <String> p4 = new ArrayList <String>(13);
		deck.addAll(Arrays.asList(deckArr));
		Collections.shuffle(deck);
		
		//Deal cards to each player
		while(!deck.isEmpty()){
            p1.add(deck.get(0));
            deck.remove(0);
            p2.add(deck.get(0));
            deck.remove(0);
            p3.add(deck.get(0));
            deck.remove(0);
            p4.add(deck.get(0));
            deck.remove(0);
        }
		//points for each player
		int p1Points = 0;
		int p2Points = 0;
		int p3Points = 0;
		int p4Points = 0;
		
		//0-Spades, 1 - Hearts, 2 - Clubs, 3 - Diamonds
		//how many of each suit does each player have
		int numSuits [] = new int[4];
		//to display their hands in the correct format
		ArrayList <String> Spades = new ArrayList <String>();
		ArrayList <String> Hearts = new ArrayList <String>();
		ArrayList <String> Clubs = new ArrayList <String>();
		ArrayList <String> Diamonds = new ArrayList <String>();
		
		//add points 
		for(String x : p1) {
			if(x.charAt(1) == 'S' ) {
				numSuits[0]++;
				Spades.add(x);
			}
			else if(x.charAt(1) == 'H') {
				numSuits[1]++;
				Hearts.add(x);
			}
			else if(x.charAt(1) == 'C') {
				numSuits[2]++;
				Clubs.add(x);
			}
			else if(x.charAt(1) == 'D') {
				numSuits[3]++;
				Diamonds.add(x);
			}
			
			if(x.charAt(0) == 'A')
				p1Points +=4;
			else if(x.charAt(0) == 'K')
				p1Points +=3;
			else if(x.charAt(0) == 'Q')
				p1Points +=2;
			else if(x.charAt(0) == 'J')
				p1Points ++;
		}

		for(int x : numSuits) {
			if(x == 0)
				p1Points += 3;
			else if(x==1)
				p1Points +=2;
			else if(x == 2)
				p1Points ++;
		}
		System.out.println("Player 1\nSpades: "+Spades+"\nHearts: "+Hearts+"\nDiamonds: "+Diamonds+"\nClubs: "+Clubs+"\nTotal Points: "+p1Points+"\n");
		
		numSuits[0] = 0;
		numSuits[1] = 0;
		numSuits[2] = 0;
		numSuits[3] = 0;
		Spades.clear();
		Hearts.clear();
		Diamonds.clear();
		Clubs.clear();
		
		for(String x : p2) {
			if(x.charAt(1) == 'S' ) {
				numSuits[0]++;
				Spades.add(x);
			}
			else if(x.charAt(1) == 'H') {
				numSuits[1]++;
				Hearts.add(x);
			}
			else if(x.charAt(1) == 'C') {
				numSuits[2]++;
				Clubs.add(x);
			}
			else if(x.charAt(1) == 'D') {
				numSuits[3]++;
				Diamonds.add(x);
			}
			
			if(x.charAt(0) == 'A')
				p2Points +=4;
			else if(x.charAt(0) == 'K')
				p2Points +=3;
			else if(x.charAt(0) == 'Q')
				p2Points +=2;
			else if(x.charAt(0) == 'J')
				p2Points ++;
		}
		
		for(int x : numSuits) {
			if(x == 0)
				p2Points += 3;
			else if(x==1)
				p2Points +=2;
			else if(x == 2)
				p2Points ++;
		}
		System.out.println("Player 2\nSpades: "+Spades+"\nHearts: "+Hearts+"\nDiamonds: "+Diamonds+"\nClubs: "+Clubs+"\nTotal Points: "+p2Points+"\n");
		
		numSuits[0] = 0;
		numSuits[1] = 0;
		numSuits[2] = 0;
		numSuits[3] = 0;
		Spades.clear();
		Hearts.clear();
		Diamonds.clear();
		Clubs.clear();
		
		for(String x : p3) {
			if(x.charAt(1) == 'S' ) {
				numSuits[0]++;
				Spades.add(x);
			}
			else if(x.charAt(1) == 'H') {
				numSuits[1]++;
				Hearts.add(x);
			}
			else if(x.charAt(1) == 'C') {
				numSuits[2]++;
				Clubs.add(x);
			}
			else if(x.charAt(1) == 'D') {
				numSuits[3]++;
				Diamonds.add(x);
			}
			
			if(x.charAt(0) == 'A')
				p3Points +=4;
			else if(x.charAt(0) == 'K')
				p3Points +=3;
			else if(x.charAt(0) == 'Q')
				p3Points +=2;
			else if(x.charAt(0) == 'J')
				p3Points ++;
		}
		
		for(int x : numSuits) {
			if(x == 0)
				p3Points += 3;
			else if(x==1)
				p3Points +=2;
			else if(x == 2)
				p3Points ++;
		}
		System.out.println("Player 3\nSpades: "+Spades+"\nHearts: "+Hearts+"\nDiamonds: "+Diamonds+"\nClubs: "+Clubs+"\nTotal Points: "+p3Points+"\n");
		
		numSuits[0] = 0;
		numSuits[1] = 0;
		numSuits[2] = 0;
		numSuits[3] = 0;
		Spades.clear();
		Hearts.clear();
		Diamonds.clear();
		Clubs.clear();
		
		for(String x : p4) {
			if(x.charAt(1) == 'S' ) {
				numSuits[0]++;
				Spades.add(x);
			}
			else if(x.charAt(1) == 'H') {
				numSuits[1]++;
				Hearts.add(x);
			}
			else if(x.charAt(1) == 'C') {
				numSuits[2]++;
				Clubs.add(x);
			}
			else if(x.charAt(1) == 'D') {
				numSuits[3]++;
				Diamonds.add(x);
			}
			
			if(x.charAt(0) == 'A')
				p4Points +=4;
			else if(x.charAt(0) == 'K')
				p4Points +=3;
			else if(x.charAt(0) == 'Q')
				p4Points +=2;
			else if(x.charAt(0) == 'J')
				p4Points ++;
		}
		
		for(int x : numSuits) {
			if(x == 0)
				p4Points += 3;
			else if(x==1)
				p4Points +=2;
			else if(x == 2)
				p4Points ++;
		}
		System.out.println("Player 4\nSpades: "+Spades+"\nHearts: "+Hearts+"\nDiamonds: "+Diamonds+"\nClubs: "+Clubs+"\nTotal Points: "+p4Points+"\n");
		
		numSuits[0] = 0;
		numSuits[1] = 0;
		numSuits[2] = 0;
		numSuits[3] = 0;
		Spades.clear();
		Hearts.clear();
		Diamonds.clear();
		Clubs.clear();

		if(p1Points > p2Points && p1Points > p3Points && p1Points > p4Points){
            System.out.println("Player 1 is the winner!");
        }
        else if(p1Points == p2Points && p1Points > p3Points && p1Points > p4Points){
            System.out.println("Player 1 and Player 2 are the winners!");
        }
        else if(p1Points > p2Points && p1Points == p3Points && p1Points > p4Points){
            System.out.println("Player 1 and Player 3 are the winners!");
        }
        else if(p1Points > p2Points && p1Points > p3Points && p1Points == p4Points){
            System.out.println("Player 1 and Player 4 are the winners!");
        }
        else if(p2Points > p1Points && p2Points > p3Points && p2Points > p4Points){
            System.out.println("Player 2 is the winner!");
        }
        else if(p2Points > p1Points && p2Points == p3Points && p2Points > p4Points){
            System.out.println("Player 2 and Player 3 are the winners!");
        }
        else if(p2Points > p1Points && p2Points > p3Points && p2Points == p4Points){
            System.out.println("Player 2 and Player 4 are the winners!");
        }
        else if(p3Points > p2Points && p3Points > p1Points && p3Points > p4Points){
            System.out.println("Player 3 is the winner!");
        }
        else if(p3Points > p2Points && p3Points > p1Points && p3Points == p4Points){
            System.out.println("Player 3 and Player 4 are the winners!");
        }
        else if(p4Points > p2Points && p4Points > p3Points && p4Points > p1Points){
            System.out.println("Player 4 is the winner!");
        }
	}

}
