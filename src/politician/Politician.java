package politician;

import ideology.Ideology;

abstract class Politician {
    private final String name;
    private final String state;
    private final Ideology ideology;


    protected Politician(String name, String state, Ideology ideology){
        this.name = name;
        this.state = state;
        this.ideology = ideology;
    }

    protected void sayHello(){}

}
