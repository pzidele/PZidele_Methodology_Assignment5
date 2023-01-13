package assignment5;

import java.util.ArrayList;

public class EC1FavorsRepublicanOneState implements IElectoralCollegeStrategy{


	ArrayList<State> states;
	private Country country;

	public EC1FavorsRepublicanOneState(ArrayList<State> states, Country country) {
		this.states = states;
		this.country = country;
	}

	@Override
	public void electoralVotes() {
		for (State s : states) {
			if(s.getName().equals("NY")){
		    	country.setTotalRepEC(country.getTotalRepEC() + s.getNumElectoral());
			}
		}

	}
}

