package OOP.SOLID;

public class NoShape implements Shape{

    //Shape noShape = new NoShape(); ??? noShape is no Shape and cannot calculate area - broke 3rd rule, (*bo nie jest zastępcza)
    @Override
    public double area() {
        throw new IllegalStateException("Cannot calculate area");
    }
}
