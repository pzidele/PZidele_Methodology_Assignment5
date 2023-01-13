package assignment5;

import java.util.ArrayList;

public class EC4FavorsDemocratChangesRepVotes implements IElectoralCollegeStrategy {
	
//	There is a democrat favoring strategy that takes 2% of all republican votes 
//	in every state and makes them democrat votes instead (note that this only 
//			affects the electoral votes if there is a state within this margin)
   
	ArrayList<State> states;
	Country country;
	
	public EC4FavorsDemocratChangesRepVotes (ArrayList<State> states, Country country) {
		this.states = states;
		this.country = country;
	}
	
	@Override
    public void electoralVotes() {
    	// loop through states
		for (State s : states) {
			// get percent of rep votes in that state
			
			int numRepVotes = s.getNumRepVotes();
			int percent = (int)(numRepVotes * .02);
			
			numRepVotes -= percent;
			
			int numDemVotes = s.getNumDemVotes()+percent;
			
			s.setNumRepVotes(numRepVotes);
			s.setNumDemVotes(numDemVotes);
			
			
			country.setTotalDemPV(country.getTotalDemPV() + s.getNumDemVotes());
			country.setTotalRepPV(country.getTotalRepPV() + s.getNumRepVotes());
			
			// subtract from rep
			// add to dem
		}
    }


}
