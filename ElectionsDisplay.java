package ElectoralVotes;

import java.util.Observable;
import java.util.Observer;

public class ElectionsDisplay implements Observer {

    private int numDemPopular;
    private int numRepPopular;
    private int numDemElectoral;
    private int numRepElectoral;

    private IElectoralCollegeStrategy iEC;
    private IPopularVoteStrategy iPV;

    String observerType;

    public void setIEC(IElectoralCollegeStrategy iEC) {
        this.iEC = iEC;
    }

    public void setIPV(IPopularVoteStrategy iPV) {
        this.iPV = iPV;
    }

    public ElectionsDisplay(Observable observable, String type) {
        observable.addObserver(this);
        this.observerType = type;
    }

    public void update(Observable observable, Object obj) {
        if (observable instanceof ElectionStatistics) {
            ElectionStatistics electionStatistics = (ElectionStatistics) observable;

            if (iPV != null) {
                iPV.calculateDemocrat();
                iPV.calculateRepublican();
            }
            if (iEC != null) {
                iEC.electoralVotes();
            }

            this.numDemPopular = electionStatistics.getNumDemPopular();
            this.numRepPopular = electionStatistics.getNumRepPopular();

            this.numDemElectoral = electionStatistics.getNumDemElectoral();
            this.numRepElectoral = electionStatistics.getNumRepElectoral();


            display();
        }

    }

    public void display() {
        System.out.println("\nType " + observerType + "\nNumber Democrat Popular Vote: " + numDemPopular +
                "\nNumber Republican Popular Vote: " + numRepPopular +
                "\nNumber Democrat Electoral Vote: " + numDemElectoral +
                "\nNumber Republican Electoral Vote: " + numRepElectoral +
                "\nAll reports are purely observational and not legally binding "
                + "in any way. \nTime now: " + java.time.LocalTime.now());
    }

}


