package OOP.Inheritance;

//Inheritance allows us to create new class from an existing class.
//Benefit of inheritance is that we can remove the duplicate code
//Protected is mainly used when deal with subclasses and you wanna have access to the parent attributes
public class Main {
    public static void main(String[] args) {

        String [] languages = {"Java","Go","C++"};
        Programmer java = new Programmer("Jamal", 21,"London","Full Stack",languages);
        java.writeSomeCode();

        System.out.println("////////////");
        java.sayHi();

    }
}
