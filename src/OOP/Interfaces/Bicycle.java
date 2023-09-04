package OOP.Interfaces;

public class Bicycle implements Vehicle{
    private int currentSpeed;

    public Bicycle() {
    }

    public Bicycle(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int amount){
        System.out.println("Jump on bike and start pedaling");
        this.currentSpeed += amount;
    }

    @Override
    public void applyBreaks(int amount){
        this.currentSpeed -= amount;
    }


    @Override
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public double milesToKm(int speed) {
        return Vehicle.super.milesToKm(speed)/2;
    }
}
