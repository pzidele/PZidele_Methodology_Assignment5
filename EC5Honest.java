package assignment5;

import java.util.ArrayList;

public class EC5Honest implements IElectoralCollegeStrategy{
	
	
	ArrayList<State> states;
	Country country;
	
	public EC5Honest (ArrayList<State> states, Country country) {
		this.states = states;
		this.country = country;
	}
	
    @Override
    public void electoralVotes() {

    	for (State s : states) {
    		country.setTotalDemEC(country.getTotalDemEC() + s.getNumElectoral());
    		country.setTotalRepEC(country.getTotalRepEC() + s.getNumElectoral());

    	}
    	
    }
}
