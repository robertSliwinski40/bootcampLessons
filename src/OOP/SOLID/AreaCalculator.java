package OOP.SOLID;

import java.util.List;

public class AreaCalculator implements IAreaCalculator {

    @Override
    public double sum(List<Shape> shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            sum += shapes.get(i).area();
        }
        return sum;
    }
/*  Broke 1st Principle SOLID
    Broke 2nd rule: add interface with area(), modify AreaCalc to add all area() calculation


 */
}
