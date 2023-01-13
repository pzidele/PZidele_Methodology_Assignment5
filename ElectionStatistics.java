package assignment5;

import java.util.Observable;

// observable
public class ElectionStatistics extends Observable {
	Country country;
	private int numPopular;

	public ElectionStatistics() {}
	
	public void votesChanged () {
		setChanged();
		notifyObservers();
	}
	
	public void setVotes(Country country) {
		this.country = country;
		votesChanged();
	}

	public int getNumDemElectoral() {
		return country.getTotalDemEC();
	}

	public int getNumRepElectoral() {
		return country.getTotalRepEC();
	}

	public int getNumDemPopular() {
		return country.getTotalDemPV();
	}
	
	public int getNumRepPopular() {
		return country.getTotalRepPV();
	}

}