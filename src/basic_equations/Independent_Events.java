package basic_equations;

import java.util.ArrayList;

public class Independent_Events {
    ArrayList<Double> probabilities;
    public Independent_Events(ArrayList<Double> probabilities){
        this.probabilities = probabilities;
    }
    double Probability_of_events(){
        double p = probabilities.get(0);
        for(int i = 1; i < probabilities.size(); i++){
            p = p * probabilities.get(i);
        }
        return p;
    }

    double Probability_of_events(ArrayList<Integer> events){
        double p = probabilities.get(events.get(0));
        for(int i = 1; i < events.size(); i++){
            p = p * probabilities.get(events.get(i));
        }
        return p;
    }
}
