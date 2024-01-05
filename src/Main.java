public class Main {
    public static void main(String[] args) {
        int[] scores1 = {5, 4, 5, 4, 3};
        MyCompetitor competitor1 = new MyCompetitor(100, "Keith John Talbot", "keith@example.com", "1990-01-01", "Novice", "Level 5", scores1);

        int[] scores2 = {3, 3, 3, 2, 4};
        MyCompetitor competitor2 = new MyCompetitor(101, "Jane Macdonald", "jane@example.com", "1992-05-15", "Novice", "Level 4", scores2);

        // Test methods
        System.out.println(competitor1.getFullDetails());
        System.out.println(competitor2.getShortDetails());
    }
}
