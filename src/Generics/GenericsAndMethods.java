package Generics;

public class GenericsAndMethods {
    public static void main(String[] args) {
        String[] names = {"John", "Jamila"};
        Character[] letters = {'z', 'b', 'g'};
        Integer[] numbers = {1, 2, 3, 4, 5};
        print(names);
        print(letters);
        print(numbers);

    }

    static <T> void print(T[] array) {      //static <T> T print(T[]){} remember to add return type T
        for (T e : array) {
            System.out.println(e.getClass().getName() + "-" + e);
        }
    }
}
