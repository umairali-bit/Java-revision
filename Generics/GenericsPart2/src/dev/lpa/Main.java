package dev.lpa;

interface Player {}

// creating a record with two fields. Name and postion.
record BaseballPlayer(String name, String position) implements Player{}

record FootballPlayer(String name, String position) implements Player{}

public class Main {

    public static void main(String[] args) {

        BaseballTeam Phillies = new BaseballTeam("Phillies");
        BaseballTeam Houston = new BaseballTeam("Houston");
        scoreResult(Phillies, 3, Houston, 5);

        SportsTeam Phillies1 = new SportsTeam("Phillies");
        SportsTeam Houston1 = new SportsTeam("Houston");
        scoreResult(Phillies1, 3, Houston1, 5);

        //adding some players to the baseball team
        var Harper = new BaseballPlayer("B Harper", "Right Fielder");
        var Marsh = new BaseballPlayer("B Marsh", "Right Fielder");

        Phillies.addTeamMember(Harper);
        Phillies.addTeamMember(Marsh);
        Phillies.listTeamMembers();

        //creating a FootBall team
        SportsTeam afc = new SportsTeam("Adelaide Crows");

        //creating a FootBall Player
        var tex = new FootballPlayer("Tex Walker", "Center half forward");
        var guthrie = new BaseballPlayer("Guthrie", "Right Fielder");

        //adding the player to the team
        afc.addTeamMember(tex);
        afc.addTeamMember(guthrie); // should be invalid to add a baseball player to add to a Football team. create rules.
        afc.listTeamMembers();



    }

    //creating an overloaded method

    public static void scoreResult (BaseballTeam team1, int t1_score,
                                    BaseballTeam team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    //creating an overloaded method

    public static void scoreResult (SportsTeam team1, int t1_score,
                                    SportsTeam team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

}

