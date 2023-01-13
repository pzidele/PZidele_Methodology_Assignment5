package assignment5;

public class State {
	
	private String name;
	private int numElectoral;
	private int numDemPopular;
	private int numRepPopular;
	
	private int numDemElectoral;
	private int numRepElectoral;
	
	public State(String name, int numElectoral, int numDem, int numRep) {
		this.name = name;
		this.numElectoral = numElectoral;
		this.numDemPopular = numDem;
		this.numRepPopular = numRep;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the numElectoral
	 */
	public int getNumElectoral() {
		return numElectoral;
	}

	/**
	 * @param numElectoral the numElectoral to set
	 */
	public void setNumElectoral(int numElectoral) {
		this.numElectoral = numElectoral;
	}

	/**
	 * @return the numDemVotes
	 */
	public int getNumDemVotes() {
		return numDemPopular;
	}

	/**
	 * @param numDemVotes the numDemVotes to set
	 */
	public void setNumDemVotes(int numDemVotes) {
		this.numDemPopular = numDemVotes;
	}

	/**
	 * @return the numRepVotes
	 */
	public int getNumRepVotes() {
		return numRepPopular;
	}

	/**
	 * @param numRepVotes the numRepVotes to set
	 */
	public void setNumRepVotes(int numRepVotes) {
		this.numRepPopular = numRepVotes;
	}
	
	
	
	

}
