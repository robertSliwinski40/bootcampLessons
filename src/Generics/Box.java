package Generics;

/*
t type; any letter will do
mean you can pass to the class Box any type of data - Integer, Point, custom class
 */

public class Box<T> {   // Box<t K V L> but add to the field below
                        // Box<T, extends Comparable<T>> see BoundedTypeParameter IMPORTANT!!!senior level
    private T t;        //if someone sends a String, it becomes String, if Integer it will become Integer


    public void set(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
