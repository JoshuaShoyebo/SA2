public class MyCompetitor {
    private int competitorNumber;
    private String name;
    private String email;
    private String dateOfBirth;
    private String category;
    private String level;
    private int[] scores;

    // Constructor
    public MyCompetitor(int competitorNumber, String name, String email, String dateOfBirth, String category, String level, int[] scores) {
        this.competitorNumber = competitorNumber;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.category = category;
        this.level = level;
        this.scores = scores;
    }

    // Getters and Setters
    // ...

    // Method to calculate overall score
    public double getOverallScore() {
        // Your logic to calculate overall score from scores array based on competition rules
        // Example: calculate average score
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    // Method to get full details
    public String getFullDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Competitor number ").append(competitorNumber).append(", name ").append(name).append(", email ").append(email).append(", date of birth ").append(dateOfBirth).append(".\n");
        details.append(name).append(" is a ").append(level).append(" in ").append(category).append(" category and received these scores: ");
        for (int score : scores) {
            details.append(score).append(" ");
        }
        details.append("\nThis gives an overall score of ").append(getOverallScore());
        return details.toString();
    }

    // Method to get short details
    public String getShortDetails() {
        return "CN " + competitorNumber + " (" + getInitials() + ") has overall score " + getOverallScore();
    }

    // Method to get initials
    private String getInitials() {
        StringBuilder initials = new StringBuilder();
        String[] nameParts = name.split(" ");
        for (String part : nameParts) {
            initials.append(part.charAt(0));
        }
        return initials.toString().toUpperCase();
    }

    // Getters and Setters for attributes
    // ...
}
