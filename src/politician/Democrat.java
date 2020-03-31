package politician;

import ideology.Ideology;

public class Democrat extends Politician {
    public Democrat(String name, String state, Ideology ideology){
        super(name, state, ideology);
    }

    public void sayHello(){
        System.out.println("Hello, my name is " + name + ".");
        System.out.println("I am a proud " + ideology.getIdeology() + " Democrat from the great state of " + state + "!");
        ideology.expressViews();
    }
}
