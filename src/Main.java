import basic_equations.*;
import problems.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Double> p = new ArrayList<>();
        p.add(0.3);
        p.add(0.5);
        p.add(0.1);
        p.add(0.1);
        ArrayList<Double> o = new ArrayList<>();
        o.add(1.0);
        o.add(2.0);
        o.add(3.0);
        o.add(4.0);
        Expectation e = new Expectation(p,o);
        Variance v = new Variance(p,o);
        System.out.println(e.getExpectation()+ "\n" + v.getVariance());
    }
}
