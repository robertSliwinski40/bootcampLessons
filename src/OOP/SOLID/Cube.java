package OOP.SOLID;

public class Cube implements Shape, ThreeDimensionShape {
    private final int length;

    public Cube(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    //this calculates volume, not area. What to do?
    //apply double calculateVolume(int length); in interface to force implementation in subclasses???
    //what about circle, square and triangle - they are not 3D shape??? broke 4th rule
    //So we create another interface 3DShape and implement it in Cube
    @Override
    public double area() {
        return  100;
    }

    @Override
    public double volume(int length) {
        return Math.pow(getLength(), 3);
    }
}
