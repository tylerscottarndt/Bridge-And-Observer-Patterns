package client;

import election.Election;
import ideology.Moderate;
import ideology.Progressive;
import ideology.Radical;
import politician.*;
import scoreboard.Scoreboard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        // Primary Politicians
        Politician democrat1 = new Democrat("Francis Underwood", "South Carolina", new Radical());
        Politician democrat2 = new Democrat("Lori Lightfoot", "Illinois", new Moderate());
        Politician republican1 = new Republican("William Conway", "New York", new Moderate());
        Politician republican2 = new Republican("Sara Jones", "West Virginia", new Radical());
        Politician independent1 = new Independent("Alex Romero", "Arizona", new Progressive());
        Politician independent2 = new Independent("Tara Smith", "Oregon", new Progressive());

        // Introductions
        democrat1.sayHello();
        democrat2.sayHello();
        republican1.sayHello();
        republican2.sayHello();
        independent1.sayHello();
        independent2.sayHello();

        // Party Nominees
        List<Politician> nominees = new ArrayList<>();
        nominees.add(democrat1);
        nominees.add(republican1);
        nominees.add(independent1);

        System.out.println("The 2020 Presidential Nominees:\n");
        for(Politician p : nominees){
            System.out.println(p.getName());
        }
        System.out.println();

        // Scoreboard observer
        Scoreboard scoreboard = new Scoreboard();

        // Election subject
        Election election = new Election();
        election.register(scoreboard);

        System.out.println("The polls are now open!\n");
        election.simulateElection();
    }
}
