package OOP.Inheritance;

import java.util.Arrays;

//subclass
//change attributes to protected and you can access them from subclasses
public class Programmer extends Employee{
    private String[] programmingLanguages;

    public Programmer(String name, int age, String address, String experience) {
        super(name, age, address, experience);
    }

    public Programmer(String name, int age, String address, String experience, String[] programmingLanguages) {
        super(name, age, address, experience);
        this.programmingLanguages = programmingLanguages;
    }

    public void writeSomeCode(){
        super.sayHi();          //refers to parent class (super class)
        System.out.println(this.name+": Writing some code");
    }

    @Override                   //Overrides parent class
    public void sayHi() {
        String m = """
                Hi, my name is %s I am programmer""".formatted(this.name);
        System.out.println("function has been override");
        System.out.println(m);
    }
}
