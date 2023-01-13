package assignment5;

import java.util.ArrayList;

//There is a second republican favoring strategy that considers the state 
//where the democrat has the smallest lead to be "too close to call" and splits 
//the electoral votes giving half to the democrat and half to the republican 
//(and in the event of an odd number it gives the extra vote to the republican of course)
public class EC2FavorsRepublicanTooCloseToCall implements IElectoralCollegeStrategy {
	
	ArrayList<State> states;
	Country country;
	
	public EC2FavorsRepublicanTooCloseToCall(ArrayList<State> states, Country country) {
		this.states = states;
		this.country = country;
	}
	
    @Override
    public void electoralVotes() {
    	// find the state with the smallest lead
    	int smallestLead = states.get(0).getNumDemVotes()-states.get(0).getNumRepVotes();
    	State stateWithSmallestLead = null;
    	
    	for (State s : states) {
    		if (s.getNumDemVotes() - s.getNumRepVotes() < smallestLead) {
    			smallestLead = s.getNumDemVotes() - s.getNumRepVotes();
    			stateWithSmallestLead = s;
    		}
    	}
    	
    	// split ec votes of that state: half and half to rep and dem
    	// extra to rep if odd
    	int electoralVotesToBeAdded;
    	
    	
		electoralVotesToBeAdded = stateWithSmallestLead.getNumElectoral() / 2;
		int numRep = 0;
    	int numDem = 0;
    	
		if (electoralVotesToBeAdded % 2 != 0) { //odd
			numRep = electoralVotesToBeAdded + 1;
		}
		else {
			numRep = electoralVotesToBeAdded;
			numDem = electoralVotesToBeAdded;
		}
    		
    	
    	country.setTotalDemEC(country.getTotalDemEC() + numDem);
    	country.setTotalRepEC(country.getTotalRepEC() + numRep);
    	
     }
}
