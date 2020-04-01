package election;

import scoreboard.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Election implements Subject {
    private List<Observer> observers;
    private int democratVotes;
    private int republicanVotes;
    private int independentVotes;
    private final int THRESH;

    public Election(){
        this.observers = new ArrayList<>();
        this.democratVotes = 0;
        this.republicanVotes = 0;
        this.independentVotes = 0;
        this.THRESH = 270;
    }

    @Override
    public void register(Observer observer) { observers.add(observer); }

    @Override
    public void unregister(Observer observer) {
        int index = observers.indexOf(observer);
        if(index != -1){
            observers.remove(index);
        }
        else{
            throw new IllegalArgumentException("observer not found in the list");
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(democratVotes, republicanVotes, independentVotes);
        }
    }

    public void simulateElection(){
        Random rand = new Random();
        while(Math.max(democratVotes, Math.max(republicanVotes, independentVotes)) < THRESH){
            democratVotes += rand.nextInt(50);
            republicanVotes += rand.nextInt(50);
            independentVotes += rand.nextInt(50);
            notifyObserver();
        }
    }
}
