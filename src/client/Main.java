package client;

import ideology.Moderate;
import ideology.Progressive;
import ideology.Radical;
import politician.Democrat;
import politician.Independent;
import politician.Republican;

public class Main {
    public static void main(String[] args){

        // Bridge Pattern
        Democrat democrat = new Democrat("Francis Underwood", "South Carolina", new Radical());
        Republican republican = new Republican("William Conway", "New York", new Moderate());
        Independent independent = new Independent("Alex Romero", "Arizona", new Progressive());

        democrat.sayHello();
        republican.sayHello();
        independent.sayHello();
    }
}
