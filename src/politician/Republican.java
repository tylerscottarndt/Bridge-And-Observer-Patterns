package politician;

import ideology.Ideology;

public class Republican extends Politician {
    public Republican(String name, String state, Ideology ideology){
        super(name, state, ideology);
    }

    public void sayHello(){
        System.out.println("Hello, my name is " + name + ".");
        System.out.println("I am a proud " + ideology.getIdeology() + " Republican from the great state of " + state + "!");
        ideology.expressViews();
    }
}
