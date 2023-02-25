package basic_equations;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Variance {
    private double v;
    public Variance(ArrayList<Double> probabilities, ArrayList<Double> outcomes){
        DecimalFormat df = new DecimalFormat("#.####");
        ArrayList<Double> sqrd_outcomes = new ArrayList<>(outcomes);
        sqrd_outcomes.replaceAll(aDouble -> aDouble * aDouble);
        Expectation e = new Expectation(probabilities,outcomes);
        Expectation e_sq = new Expectation(probabilities,sqrd_outcomes);
        v = (e_sq.getExpectation() - (e.getExpectation() * e.getExpectation()));
        v = Double.parseDouble(df.format(v));
    }
    public Variance(ArrayList<Double> probabilities, ArrayList<Double> outcomes, int NumberOfDecimals){
        String d = new String(new char[NumberOfDecimals]).replace("\0","#");
        DecimalFormat df = new DecimalFormat("#." + d);
        ArrayList<Double> sqrd_outcomes = new ArrayList<>(outcomes);
        sqrd_outcomes.replaceAll(aDouble -> aDouble * aDouble);
        Expectation e = new Expectation(probabilities,outcomes);
        Expectation e_sq = new Expectation(probabilities,sqrd_outcomes);
        v = (e_sq.getExpectation() - (e.getExpectation() * e.getExpectation()));
        v = Double.parseDouble(df.format(v));
    }
    public double getVariance(){return v;}
}
