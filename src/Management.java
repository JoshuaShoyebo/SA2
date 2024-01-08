public class Management {
    private List<MyCompetitor> competitors;
    private List<Staff> staffMembers;
    private List<Competition> competitions;

    public Management() {
        this.competitors = new ArrayList<>();
        this.staffMembers = new ArrayList<>();
        this.competitions = new ArrayList<>();
    }

    public void registerCompetitor(MyCompetitor competitor) {
        competitors.add(competitor);
    }

    public void recordResult(MyCompetitor competitor, int[] scores) {
        // Logic to record scores for a competitor
    }

    public void generateReports() {
        System.out.println("Competitonn Report:");
        for (MyCompetitor competitor : competitors) {
            System.out.println(competitor.getFullDetails());
        }

        // Finding the competitor with the highest score
        MyCompetitor highestScorer = competitors.stream()
                .max(Comparator.comparingDouble(MyCompetitor::getOverallScore))
                .orElse(null);

        if (highestScorer != null) {
            System.out.println("\nCompetitor with the highest score:");
            System.out.println(highestScorer.getFullDetails());
        }

        // Calculate some summary statistics
        int[] scoreFrequency = new int[6]; // Assuming scores range from 0 to 5
        for (MyCompetitor competitor : competitors) {
            int[] scores = competitor.getScoreArray();
            for (int score : scores) {
                scoreFrequency[score]++;
            }
        }

        System.out.println("\nIndividual Scores Frequency:");
        for (int i = 0; i < scoreFrequency.length; i++) {
            System.out.println("Score " + i + ": " + scoreFrequency[i]);
        }

        // Other statistical information or reports can be generated here
    }
}


