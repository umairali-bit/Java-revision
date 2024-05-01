package dev.lpa;

// creating a record with two fields. Name and postion.
record BaseballPlayer(String name, String position) {}

public class Main {

    public static void main(String[] args) {

        BaseballTeam Phillies = new BaseballTeam("Phillies");
        BaseballTeam Houston = new BaseballTeam("Houston");
        scoreResult(Phillies, 3, Houston, 5);

        //adding some players to the baseball team
        var Harper = new BaseballPlayer("B Harper", "Right Fielder");
        var Marsh = new BaseballPlayer("B Marsh", "Right Fielder");

        Phillies.addTeamMember(Harper);
        Phillies.addTeamMember(Marsh);
        Phillies.listTeamMembers();



    }

    public static void scoreResult (BaseballTeam team1, int t1_score,
                                    BaseballTeam team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

}
