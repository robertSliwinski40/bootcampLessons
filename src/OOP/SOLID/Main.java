package OOP.SOLID;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        IAreaCalculator areaCalculator = new AreaCalculator();
        IAreaCalculator areaCalculatorv2 = new AreaCalculatorv2();
        //IAreaCalculator areaCalculatorv2 = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube(10);
        Rectangle rectangle = new Rectangle(20,5);

        List<Shape> shapes = List.of(circle, square,cube,rectangle);
        double sum = areaCalculator.sum(shapes);
        System.out.println("sum = " + sum);

        // Create new class ShapePrinter, instead write in this same class - 1st rule of SOLID
        ShapesPrinter printer = new ShapesPrinter(areaCalculatorv2);
        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));
        //Add Cube. We can't modify AreaCalculator, instead create Interface with area() method, and in AreaCalculator calculate area of all shapes
        //We extend by adding class Rectangle without modifying any of the existing class - 2nd rule
    }


}
