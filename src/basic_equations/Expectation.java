package basic_equations;

import java.util.ArrayList;

public class Expectation {
    private double e;
    public Expectation(ArrayList<Double> probabilities, ArrayList<Double> outcomes){
        for(int i = 0; i < probabilities.size(); i++){
            e += probabilities.get(i) * outcomes.get(i);
        }
    }
    public double getExpectation(){return e;}
}
