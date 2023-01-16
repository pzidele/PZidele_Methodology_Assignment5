package ElectoralVotes;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<State> states = new ArrayList<State>();

        states.add(new State("NY", 10, 150, 200));
        states.add(new State("NJ", 15, 200, 800));
        states.add(new State("CA", 25, 240, 350));
        states.add(new State("FL", 35, 220, 100));
        states.add(new State("MI", 15, 210, 80));
        states.add(new State("WV", 12, 520, 860));

        Country country = new Country(states);
        ElectionStatistics electionStats = new ElectionStatistics();

        ObserverFavorsRep observer1 = new ObserverFavorsRep(electionStats, "Observer Favors Republican", country, states);
        ObserverFavorsDem observer2 = new ObserverFavorsDem(electionStats, "Observer Favors Democrat", country, states);
        ObserverDemPopularRepElectoral observer3 = new ObserverDemPopularRepElectoral(electionStats,
                "Ovserver favors Democrat for Popular Vote and Republican for Electoral Vote", country, states);
        ObserverFavorsDemocratPopularVote observer4 = new ObserverFavorsDemocratPopularVote(electionStats, " Observer Favors Democrat Popular Vote", country, states);
        ObserverHonest observer5 = new ObserverHonest(electionStats, "Observer Favors Honest", country, states);
        electionStats.setVotes(country);
    }

}
