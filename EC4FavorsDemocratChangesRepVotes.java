package ElectoralVotes;

import java.util.ArrayList;

public class EC4FavorsDemocratChangesRepVotes implements IElectoralCollegeStrategy {

    ArrayList<State> states;
    Country country;

    public EC4FavorsDemocratChangesRepVotes(ArrayList<State> states, Country country) {
        this.states = states;
        this.country = country;
    }

    @Override
    public void electoralVotes() {
        for (State s : states) {

            int numRepVotes = s.getNumRepVotes();
            int percent = (int) (numRepVotes * .02);
            System.out.println(percent);

            numRepVotes -= percent;
            int numDemVotes = s.getNumDemVotes() + percent;

            s.setNumRepVotes(numRepVotes);
            s.setNumDemVotes(numDemVotes);

            country.setTotalDemPV(country.getTotalDemPV() + s.getNumDemVotes());
            country.setTotalRepPV(country.getTotalRepPV() + s.getNumRepVotes());

            if (s.getNumDemVotes() > s.getNumRepVotes()) {
                country.setTotalDemEC(country.getTotalDemEC() + s.getNumElectoral());
            } else {
                country.setTotalRepEC(country.getTotalRepEC() + s.getNumElectoral());
            }

        }
    }


}

