package scoreboard;

public class Scoreboard implements Observer {
    private int democratVotes;
    private int republicanVotes;
    private int independentVotes;
    private final int THRESH;

    public Scoreboard(){
        democratVotes = 0;
        republicanVotes = 0;
        independentVotes = 0;
        THRESH = 270;
    }

    @Override
    public void update(int democratVotes, int republicanVotes, int independentVotes) {
        this.democratVotes = democratVotes;
        this.republicanVotes = republicanVotes;
        this.independentVotes = independentVotes;

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
