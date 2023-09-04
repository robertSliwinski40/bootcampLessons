package OOP.Abstraction;

public class Main {

    public static void main(String[] args) throws Exception{

        //new Animal("Bobby");              //abstract class, can not instantiate
        Dog dog = new Dog("Foo");
//      Dog dog1 = new Animal("Foo1");      //abstract class, can not instantiate

        Animal dog2 = new Dog("Foo2");

//      Cat  = new Animal("miau");      //abstract class, can not instantiate
        Animal cat1 = new Cat("miau1");
        Cat cat2 = new Cat("miau2");

        dog.makeSound();
        cat1.makeSound();

        String path = "src/OOP/Abstraction/data.txt";

        new NumberExtractorReport().prepareAndSendReport(path);
        System.out.println();
        new EmailExtractorReport().prepareAndSendReport(path);
    }
}
