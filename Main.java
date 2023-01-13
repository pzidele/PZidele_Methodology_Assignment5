package assignment5;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<State> states = new ArrayList<State>();

		//ArrayList<State> states = new ArrayList<State>();
		states.add(new State("NY", 10, 15, 20));
		states.add(new State("NK", 15, 20, 15));
		
		Country country = new Country(states);
		ElectionStatistics electionStats = new ElectionStatistics();
		// make observer and pass in observable
		ObserverFavorsRep observer1 = new ObserverFavorsRep(electionStats, "Observer type ?", country, states);
		
		electionStats.setVotes(country);
		
		
		// whoever wins more, dem or rep, wins popular vote
		// and then they get the num elctol votes for that state
		// and then you see which candidate ahs more lectoral votes and 
		//that is the winner of the whole country which is what we wat

	}

}
