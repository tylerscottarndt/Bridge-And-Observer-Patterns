package politician;

import ideology.Ideology;

abstract class Politician {
    protected final String name;
    protected final String state;
    protected final Ideology ideology;


    protected Politician(String name, String state, Ideology ideology){
        this.name = name;
        this.state = state;
        this.ideology = ideology;
    }

    protected void sayHello(){}
}
