package client;

import ideology.Moderate;
import ideology.Progressive;
import ideology.Radical;
import politician.Democrat;
import politician.Independent;
import politician.Republican;

public class Main {
    public static void main(String[] args){
        Democrat democrat = new Democrat("Francis Underwood", "South Carolina", new Radical());
        democrat.sayHello();

        breakLine();

        Republican republican = new Republican("William Conway", "New York", new Moderate());
        republican.sayHello();

        breakLine();

        Independent independent = new Independent("Alex Romero", "Arizona", new Progressive());
        independent.sayHello();
    }

    public static void breakLine(){ System.out.println(); }
}
