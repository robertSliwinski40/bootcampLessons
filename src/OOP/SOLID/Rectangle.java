package OOP.SOLID;

public class Rectangle implements Shape{
    private final int length;
    private final int height;

    public Rectangle(int length, int higth) {
        this.length = length;
        this.height = higth;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double area() {
        return (height*length)/2;
    }
}
