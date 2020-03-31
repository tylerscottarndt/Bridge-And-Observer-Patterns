package politician;

import ideology.Ideology;

public class Independent extends Politician {
    private String name;
    private String state;
    private Ideology ideology;

    public Independent(String name, String state, Ideology ideology){
        super(name, state, ideology);
    }

    public void sayHello(){
        System.out.println("Hello, my name is " + name + ".");
        System.out.println("I am a proud " + ideology.getIdeology() + " Independent from the great state of " + state + "!");
        ideology.expressViews();
    }
}
