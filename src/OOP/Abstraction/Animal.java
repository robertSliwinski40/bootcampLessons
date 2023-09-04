package OOP.Abstraction;

import java.util.Objects;

//abstract class can not be instantiated, mean can not create object from this class
//abstract method - must be Override (MUST BE IMPLEMENTED), have no method body,
//abstract method can only exist within abstract classes or interfaces
//The purpose of abstract class is to function as a base for subclasses
abstract public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract void makeSound();
}
