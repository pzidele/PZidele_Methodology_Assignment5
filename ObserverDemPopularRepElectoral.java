package ElectoralVotes;

import java.util.ArrayList;
import java.util.Observable;

public class ObserverDemPopularRepElectoral extends ElectionsDisplay {

    private String observerName;
    private Country country;
    private ArrayList<State> states;

    public ObserverDemPopularRepElectoral(Observable observable, String observerName, Country country, ArrayList<State> states) {
        super(observable, observerName);

        this.country = country;
        this.states = states;
        super.setIEC(new EC2FavorsRepublicanTooCloseToCall(states, country));
        super.setIPV(new PV2FavorsDemocrat(states, country));

    }
}
