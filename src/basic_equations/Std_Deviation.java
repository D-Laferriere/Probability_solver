package basic_equations;

import java.util.ArrayList;
import java.lang.Math;
public class Std_Deviation {
    private final double d;
    public Std_Deviation(ArrayList<Double> probabilities, ArrayList<Double> outcomes){
        Variance v = new Variance(probabilities, outcomes);
        d = Math.sqrt(v.getVariance());
    }

    public double getStd_Deviation(){return d;}
}
