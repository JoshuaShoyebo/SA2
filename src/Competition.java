import java.util.ArrayList;
import java.util.List;

public class Competition {
    private String competitionName;
    private String category;
    private List<MyCompetitor> competitors;

    public Competition(String competitionName, String category) {
        this.competitionName = competitionName;
        this.category = category;
        this.competitors = new ArrayList<>();
    }

    public void addCompetitor(MyCompetitor competitor) {
        competitors.add(competitor);
    }

    public void removeCompetitor(MyCompetitor competitor) {
        competitors.remove(competitor);
    }

    // Other methods to handle competition details
    // ...
}
