package ElectoralVotes;

import java.util.Observable;

public class ElectionStatistics extends Observable {
	Country country;

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
