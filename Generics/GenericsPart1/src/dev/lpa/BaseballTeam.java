package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class BaseballTeam {

    //practicing encapsulation

    private String teamName;

    private List <BaseballPlayer> teamMembers= new ArrayList<>();

    int totalWins = 0;
    int totalLosses = 0;
    int totalTies = 0;

    public BaseballTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember (BaseballPlayer player) {

        if(!teamMembers.contains(player)) {
            teamMembers.add(player);
        }
    }

    public void listTeamMembers () {

        System.out.println(teamName + " Roster: ");
        System.out.println(teamMembers);

    }

    //if there are no losses no ties the team will be ranked 1
    public int ranking () {
        return (totalLosses * 2) + totalTies + 1;
    }

}
