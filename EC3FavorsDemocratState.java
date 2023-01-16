package ElectoralVotes;

import java.util.ArrayList;

public class EC3FavorsDemocratState implements IElectoralCollegeStrategy {

    ArrayList<State> states;
    Country country;

    public EC3FavorsDemocratState(ArrayList<State> states, Country country) {
        this.states = states;
        this.country = country;
    }


    @Override
    public void electoralVotes() {

        int numStateWithMostElectoral = 0;
        State stateWithMostElectoral = null;

        for (State s : states) {
            if (s.getNumElectoral() > numStateWithMostElectoral) {
                numStateWithMostElectoral = s.getNumElectoral();
                stateWithMostElectoral = s;
            }
        }
        country.setTotalDemEC(country.getTotalDemEC() + stateWithMostElectoral.getNumElectoral());
    }


}

