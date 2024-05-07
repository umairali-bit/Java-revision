package dev.lpa;

import java.util.ArrayList;
import java.util.List;



//creating a generic class
// T represents a player whether it is a baseball player or a football player
public class Team <T> {

    //practicing encapsulation

    private String teamName;

    private List <T> teamMembers= new ArrayList<>();

    int totalWins = 0;
    int totalLosses = 0;
    int totalTies = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember (T t) {

        if(!teamMembers.contains(t)) {
            teamMembers.add(t);
        }
    }

    public void listTeamMembers () {

        System.out.println(teamName + " Roster: ");
        System.out.println(teamMembers);

    }

    //if there are no losses, no ties the team will be ranked 1. The ranked first team cannot be higher than 1
    public int ranking () {
        return (totalLosses * 2) + totalTies + 1;
    }

    //check the wins
    public String setScore (int ourScore, int theirScore) {
        String message = "Lost to:";
        if(ourScore > theirScore) {
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "tied";
        } else {
            totalLosses++;
        }
        return message;

    }

    @Override
    public String toString() {
        return teamName + " (Ranked " + ranking() + ")";
    }
}
