package ElectoralVotes;

import java.util.ArrayList;

public class PV3Honest implements IPopularVoteStrategy {
    Country country;
    ArrayList<State> states;

    public PV3Honest(ArrayList<State> states, Country country) {
        this.states = states;
        this.country = country;
    }

    @Override
    public void calculateRepublican() {
        for (State s : states) {
            country.setTotalRepPV(country.getTotalRepPV() + s.getNumRepVotes());
        }
    }

    @Override
    public void calculateDemocrat() {
        for (State s : states) {
            country.setTotalDemPV(country.getTotalDemPV() + s.getNumDemVotes());
        }
    }
}