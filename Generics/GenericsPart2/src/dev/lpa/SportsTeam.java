package dev.lpa;


import java.util.ArrayList;
import java.util.List;

public class SportsTeam {

    private String teamName;

    private List<BaseballPlayer> teamMembers = new ArrayList<>();

    private int totalWins = 0;
    private int totalLoses = 0;
    private int totalTies = 0;


    public SportsTeam(String teamName) {
        this.teamName = teamName;
    }

    //Adding a teamMember
    public void addTeamMember(BaseballPlayer player) {

        if(!teamMembers.contains(player)) {
            teamMembers.add(player);

        }
    }


    //Listing team members

    public void ListTeamMembers() {
        System.out.println(teamName + "Roster");
        System.out.println(teamMembers);
    }


    public int ranking() {
        return (totalLoses * 2) + totalTies + 1;

    }

    public String setScore(int ourScore, int theirScore) {

        String message = "lost to";
        if(ourScore > theirScore) {
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "tied";
        } else {
            totalLoses++;
        }
        return message;

    }

    @Override
    public String toString() {
        return teamName + " (Ranked " + ranking() + ")";
    }
}


