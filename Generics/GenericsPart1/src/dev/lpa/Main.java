package dev.lpa;


//creating a baseball player record with only two fields name and position
record BaseballPlayer(String name, String position){}

public class Main {

    public static void main(String[] args) {


        //creating two baseball teams

        BaseballTeam phillies = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros = new BaseballTeam("Houston Astros");
        scoreResult(phillies, 3, astros, 5 );

        //creating new team members
        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");

        //adding new members to the team
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);

        //listing players in the team
        phillies.ListTeamMembers();



    }

    public static void scoreResult (BaseballTeam team1 , int t1_score,
                                    BaseballTeam team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);

    }

}
