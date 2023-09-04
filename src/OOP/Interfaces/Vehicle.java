package OOP.Interfaces;

//Interface contains four things
//static immutable fields, abstract methods and a bunch of default methods.
public interface Vehicle {

    //Interface contains:
    //constants
    double PURCHASE_RATE = 0.5;     //public static, no private allowed

    //abstract methods
    void move(int amount);      //public abstract - no body allowed
    void applyBreaks(int amount);
    int getCurrentSpeed() ;

    //double milesToKm(int speed); //no, because we need 1 method, not in every instance, make it default method

    //default methods

    default double milesToKm(int speed){        //no need to implement this method in instance classes
        return speed*1.609;
    }

    //static methods
}
