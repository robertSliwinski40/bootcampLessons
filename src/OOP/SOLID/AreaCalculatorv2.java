package OOP.SOLID;

import java.util.List;

public class AreaCalculatorv2 implements IAreaCalculator {

    //another AreaCalculator method which does additional function
    @Override
    public double sum(List<Shape> shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            sum += shapes.get(i).area();

            //some additional function
        }
        return sum;
    }

}
