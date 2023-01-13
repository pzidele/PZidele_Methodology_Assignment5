package assignment5;

import java.util.ArrayList;

public class PV2FavorsDemocrat implements IPopularVoteStrategy {

	Country country;
	ArrayList<State> states;
	
	public PV2FavorsDemocrat(ArrayList<State> states, Country country) {
		this.states = states;
		this.country = country;
	}
	
	
	//There is a democrat favoring strategy that simply
	//ignores the state with the most republican votes 
    @Override
    public void calculateRepublican() {
		int mostVotes = 0;
		State stateWithMostVotes = null;
		int countRepVotes = 0;

    	for (State s : states) {
    		if (s.getNumRepVotes() > mostVotes) {
    			mostVotes = s.getNumRepVotes();
    			stateWithMostVotes = s;
    		}	
    	}
    	
    	for (State s : states) {
    		if (!s.equals(stateWithMostVotes)) {
    			countRepVotes += s.getNumRepVotes();
    		}
  		
    	}
    	
    	country.setTotalRepPV(country.getTotalRepPV() + countRepVotes);
      //  return countRepVotes;
    }

    @Override
    public void calculateDemocrat() {
    	int countDemVotes = 0;
    	for (State s : states) {
    		countDemVotes += s.getNumDemVotes();
    	}
    	country.setTotalDemPV(country.getTotalDemPV() + countDemVotes);
    }


}
