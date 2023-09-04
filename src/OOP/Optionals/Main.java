package OOP.Optionals;

import java.util.Objects;
import java.util.Optional;

/*

Null Pointer Exception means the instance normally point to object in heap.
In the case of null pointer exception, there is no pointer to point
How to tackle it? - two ways; third is not great

4.5.6.Optionals, so sum up do 7 in case of Null Pointer Exception

 */
public class Main {
    public static void main(String[] args) {

        //1
        String brand = "Amigos code";
        brand = null;
        if (brand == null) {
            System.out.println("brand is null");
        } else {
            System.out.println(brand.toUpperCase());
        }

        //2
        Cat rose = new Cat("Rose");
        rose = null;
        try {
            System.out.println(rose.getName().toString());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        //3 - use method with Objects.requireNonNull
        String a = "This is a";
        //a = null;
        printInUpperCase(a);

        //4
        String b = "Ala ma kota";
        b = null;
        //this is generic <String> if b are LocalDate, so must be in <LocalDate>
        Optional<String> b1 = Optional.ofNullable(b);
        if (b1.isEmpty()) {
            System.out.println("b1 is Empty");
        } else {
            System.out.println("There is something inside: " + b1.get());
        }

        //5. another way - lambda way, better way
        b1.ifPresentOrElse(c -> {
                    System.out.println(c.toUpperCase());
                },
                () -> {
                    System.out.println("b is empty, sorry");
                });

        //6. If no do this
        var result = b1.orElse("Ala nie ma kota");
        System.out.println(result);

        //7. Sum up, do in this way

        print(Optional.of("foo"));
        print(Optional.empty());
        // Optional. Three options of("something for sure"), empty(), or ofNullable() mean or empty or not
    }

    static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void printInUpperCase(String input) {
        Objects.requireNonNull(input, "object cannot be null");
        System.out.println(input.toUpperCase());
    }

    //7
    public static void print(Optional<String> input) {
        input.ifPresent(s -> System.out.println(s.toUpperCase()));
    }
}
