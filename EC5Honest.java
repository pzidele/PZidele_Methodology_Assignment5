package ElectoralVotes;

import java.util.ArrayList;

public class EC5Honest implements IElectoralCollegeStrategy {


    ArrayList<State> states;
    Country country;

    public EC5Honest(ArrayList<State> states, Country country) {
        this.states = states;
        this.country = country;
    }

    @Override
    public void electoralVotes() {

        for (State s : states) {
            if (s.getNumDemVotes() > s.getNumRepVotes()) {
                country.setTotalDemEC(country.getTotalDemEC() + s.getNumElectoral());
            } else {
                country.setTotalRepEC(country.getTotalRepEC() + s.getNumElectoral());
            }
        }

    }
}