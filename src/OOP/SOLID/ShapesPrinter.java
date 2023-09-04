package OOP.SOLID;
/*
public class ShapesPrinter {

    public String json(double sum) {
        return "{sumShapes: %s}".formatted(sum);
    }

    public String csv(double sum) {
        return "sum_Shapes: %s".formatted(sum);
    }
}
*/

import java.util.List;
//we are breaking the rule 2. So we implement new interface (rule 5)
//select class/refactor/extract-introduce/interface (select desired methods) - this is how we extract method as interface
//after creating interface IAreaCalculator we could
public class ShapesPrinter {
    // private final IAreaCalculator areaCalculator = new AreaCalculator(); //NEVER DO THAT, THIS IS NOT MAIN

    //we are using here dependency injection
    private final IAreaCalculator areaCalculator;
    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    //thus we will depend on the abstraction, which is interface (dependency injection - look above)
    public String json(List<Shape> shapes) {
        return "{sumShapes: %s}".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes) {
        return "sum_Shapes: %s".formatted(areaCalculator.sum(shapes));
    }
}