package ideology;

public class Radical implements Ideology {

    @Override
    public String getIdeology(){ return "radical"; }

    @Override
    public void expressViews(){ System.out.println("Here are my radical views...\n"); }
}
