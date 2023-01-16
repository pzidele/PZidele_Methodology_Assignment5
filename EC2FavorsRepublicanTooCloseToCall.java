package ElectoralVotes;

import java.util.ArrayList;

public class EC2FavorsRepublicanTooCloseToCall implements IElectoralCollegeStrategy {

    ArrayList<State> states;
    Country country;

    public EC2FavorsRepublicanTooCloseToCall(ArrayList<State> states, Country country) {
        this.states = states;
        this.country = country;
    }

    @Override
    public void electoralVotes() {
        int smallestLead = states.get(0).getNumDemVotes()-states.get(0).getNumRepVotes();
        State stateWithSmallestLead = states.get(0);

        for (State s : states) {
            if (s.getNumDemVotes() - s.getNumRepVotes() < smallestLead) {
                smallestLead = s.getNumDemVotes() - s.getNumRepVotes();
                stateWithSmallestLead = s;
            }
        }

        int electoralVotesToBeAdded;

        electoralVotesToBeAdded = stateWithSmallestLead.getNumElectoral() / 2;
        int numRep = 0;
        int numDem = 0;

        if (electoralVotesToBeAdded % 2 != 0) {
            numRep = electoralVotesToBeAdded + 1;
        }
        else {
            numRep = electoralVotesToBeAdded;
            numDem = electoralVotesToBeAdded;
        }


        for(State s: states){
            if(!(s.equals(stateWithSmallestLead))) {
                if (s.getNumDemVotes() > s.getNumRepVotes()) {
                    country.setTotalDemEC(country.getTotalDemEC() + s.getNumElectoral());
                } else {
                    country.setTotalRepEC(country.getTotalRepEC() + s.getNumElectoral());
                }
            }
        }

        country.setTotalDemEC(country.getTotalDemEC() + numDem);
        country.setTotalRepEC(country.getTotalRepEC() + numRep);

    }
}

