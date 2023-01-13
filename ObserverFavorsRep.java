package assignment5;

import java.util.ArrayList;
import java.util.Observable;

public class ObserverFavorsRep extends ElectionsDisplay{

	private String observerName;
	private Country country;
	private ArrayList<State> states;
	
	public ObserverFavorsRep(Observable observable, String observerName, Country country, ArrayList<State> states) {
		super(observable, observerName);

		this.country = country;
		this.states = states;
		super.setIPV(new PV1FavorsRepublican(states, country));
		super.setIEC(new EC4FavorsDemocratChangesRepVotes(states, country));
	}
	
	

}
