package ideology;

public class Moderate implements Ideology {

    @Override
    public String getIdeology(){ return "moderate"; }

    @Override
    public void expressViews(){ System.out.println("Here are my moderate views..."); }
}
