package assignment5;

import java.util.ArrayList;

public class Country {
	
	ArrayList<State> states;
	int totalRepPV;
	int totalDemPV;
	
	int totalRepEC;
	int totalDemEC;
	
	public int getTotalDemEC() {
		return totalDemEC;
	}
	public void setTotalDemEC(int totalDemEC) {
		this.totalDemEC = totalDemEC;
	}
	public Country(ArrayList<State> states ) {//, int totalRepPV, int totalDemPV, int totalRepEC, int totalDemEC) {
		this.states = states;
		this.totalRepPV = totalRepPV;
		this.totalDemPV = totalDemPV;
		this.totalRepEC = totalRepEC;
		this.totalDemEC = totalDemEC;
	}
	public ArrayList<State> getStates() {
		return states;
	}
	
	public void addStates(State s) {
		states.add(s);
	}
	public void setStates(ArrayList<State> states) {
		this.states = states;
	}
	public int getTotalRepPV() {
		return totalRepPV;
	}
	public void setTotalRepPV(int totalRepPV) {
		this.totalRepPV = totalRepPV;
	}
	public int getTotalDemPV() {
		return totalDemPV;
	}
	public void setTotalDemPV(int totalDemPV) {
		this.totalDemPV = totalDemPV;
	}
	public int getTotalRepEC() {
		return totalRepEC;
	}
	public void setTotalRepEC(int totalRepEC) {
		this.totalRepEC = totalRepEC;
	}
	
	
}
