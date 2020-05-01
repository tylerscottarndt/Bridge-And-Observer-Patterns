package scoreboard;

import election.Election;
import election.Subject;

public class Scoreboard implements Observer {
    private int democratVotes;
    private int republicanVotes;
    private int independentVotes;
    private final int THRESH;
    private final Election election;

    public Scoreboard(Subject election){
        this.election = (Election) election;
        democratVotes = 0;
        republicanVotes = 0;
        independentVotes = 0;
        THRESH = 270;

        election.register(this);
    }

    @Override
    public void update() {
        this.democratVotes = election.getDemocratVotes();
        this.republicanVotes = election.getRepublicanVotes();
        this.independentVotes = election.getIndependentVotes();

        displayScoreboard();
        checkForWinner();
    }

    private void displayScoreboard(){
        System.out.println(
                "Democrat votes: \t" + democratVotes + "\n" +
                "Republican votes: \t" + republicanVotes + "\n" +
                "Independent votes: \t" + independentVotes + "\n"
        );
    }

    private void checkForWinner(){
        if(democratVotes >= THRESH){ System.out.println("THE DEMOCRATS ARE THE PEOPLE'S CHOICE IN 2020!"); }
        else if(republicanVotes >= THRESH){ System.out.println("THE REPUBLICANS ARE THE PEOPLE'S CHOICE IN 2020!"); }
        else if(independentVotes >= THRESH){ System.out.println("THE INDEPENDENTS ARE THE PEOPLE'S CHOICE IN 2020!"); }
    }
}
