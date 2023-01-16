package ElectoralVotes;

public class State {

    private String name;
    private int numElectoral;
    private int numDemPopular;
    private int numRepPopular;

    public State(String name, int numElectoral, int numDem, int numRep) {
        this.name = name;
        this.numElectoral = numElectoral;
        this.numDemPopular = numDem;
        this.numRepPopular = numRep;
    }

    public String getName() {
        return name;
    }

    public int getNumElectoral() {
        return numElectoral;
    }

    public int getNumDemVotes() {
        return numDemPopular;
    }

    public void setNumDemVotes(int numDemVotes) {
        this.numDemPopular = numDemVotes;
    }

    public int getNumRepVotes() {
        return numRepPopular;
    }

    public void setNumRepVotes(int numRepVotes) {
        this.numRepPopular = numRepVotes;
    }


}
