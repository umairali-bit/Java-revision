package dev.lpa;



interface Player {

    String name(); //abstract method
}

//creating players record with only two fields name and position
record BaseballPlayer(String name, String position) implements Player{}

record FootBallPlayer(String name, String position) implements Player{}

record VolleyballPlayer(String name, String position) implements Player {}

public class Main {

    public static void main(String[] args) {


        var philly = new Affiliation("city", "Philadelphia, PA" , "US");
        //creating two baseball teams

        BaseballTeam phillies1 = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros1 = new BaseballTeam("Houston Astros");
        scoreResult(phillies1, 3, astros1, 5 );

        // creating Sports teams
        SportsTeam phillies2 = new SportsTeam("Philadelphia Phillies");
        SportsTeam astros2 = new SportsTeam("Houston Astros");
        scoreResult(phillies2, 3, astros2, 5 );

        // creating Teams
        Team<BaseballPlayer, Affiliation> phillies = new Team<>("Philadelphia Phillies", philly);
        Team<BaseballPlayer, Affiliation> astros = new Team<>("Houston Astros");
        scoreResult(phillies, 3, astros, 5 );

        //creating new team members for Baseball
        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");



        //adding new members to the team
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);


        var guthrie = new BaseballPlayer("D Guthrie", "Right Fielder");
        phillies.addTeamMember(guthrie);
        phillies.listTeamMembers();

        //listing players in the team
        phillies.listTeamMembers();


        // creating a new football Team

        SportsTeam afc1 = new SportsTeam( "Adelaide Crows");
        Team<FootBallPlayer, String> afc = new Team<>( "Adelaide Crows","City of Adelaide, South Australia, in AU");
        var tex = new FootBallPlayer("Tex Walker" , "Center half forward");
        afc.addTeamMember(tex);
        var rory = new FootBallPlayer("Rory Laird", "Midfeild");
        afc.addTeamMember(rory);
        afc.listTeamMembers();


        //creating a new Team
        Team <VolleyballPlayer, Affiliation> adelaide = new Team<VolleyballPlayer, Affiliation>("Adelaide Storm");
        adelaide.addTeamMember(new VolleyballPlayer("N Roberts", "Setter"));
        adelaide.listTeamMembers();


        //creating a new Team
        var canberra = new Team<VolleyballPlayer, Affiliation>("Adelaide Storm");
        canberra.addTeamMember(new VolleyballPlayer("B Black", "Opposite"));
        canberra.listTeamMembers();
        scoreResult(canberra,0, adelaide,1);


        //creating a new team
        //Team<Integer> melbourneVB = new Team <>("Melbourne Vipers");





    }

    public static void scoreResult (BaseballTeam team1 , int t1_score,
                                    BaseballTeam team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);

    }


    public static void scoreResult (SportsTeam team1 , int t1_score,
                                    SportsTeam team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);

    }


    public static void scoreResult (Team team1 , int t1_score,
                                    Team team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);

    }

}
