package ElectoralVotes;

import java.util.ArrayList;
import java.util.Observable;

public class ObserverFavorsDem extends ElectionsDisplay {

    private String observerName;
    private Country country;
    private ArrayList<State> states;

    public ObserverFavorsDem(Observable observable, String observerName, Country country, ArrayList<State> states) {
        super(observable, observerName);
        this.country = country;
        this.states = states;
        super.setIEC(new EC5Honest(states, country));
        super.setIPV(new PV2FavorsDemocrat(states, country));
    }
}
