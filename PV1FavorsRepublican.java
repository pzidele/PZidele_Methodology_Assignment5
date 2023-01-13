package assignment5;

import java.util.ArrayList;

public class PV1FavorsRepublican implements IPopularVoteStrategy{

	// There is a republican favoring strategy that reports 5% fewer of the democrat votes 

	ArrayList<State> states;
	Country country;
	
	public PV1FavorsRepublican (ArrayList<State> states, Country country) {
		this.states = states;
		this.country = country;
	}
	

	

	@Override
	public void calculateRepublican() {
		int countRepVotes = 0;
		for (State s : states) {
			countRepVotes += s.getNumRepVotes();
		}
		
		country.setTotalRepPV(country.getTotalRepPV() + countRepVotes);
	}

	@Override
	public void calculateDemocrat() {
		int countDemVotes = 0;
		for (State s : states) {
			countDemVotes += s.getNumDemVotes();
		}
		
		countDemVotes = (int) (.95 * countDemVotes);
		
		country.setTotalDemPV(country.getTotalDemPV() + countDemVotes);
	}    
	
}

