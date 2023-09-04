package Generics;
/*
IMPORTANT senior level v2 multiple parameters
 */

public class BoundedTypeParameter_multipleParam {
    public static void main(String[] args) {

//        Integer[] num = {4, 5, 6, 7, 8, 9, 10};
//        System.out.println(countGraterThan(num, 7));
//
//        Double[] num2 = {3.0, 4.0, 6.0, 7.0, 8.0};
//        System.out.println(countGraterThan(num2, 6.5));

    }

    interface A {
    }

    interface B {
    }

    //extends class first, cannot extend multiple classes
    static <T extends Number & Comparable<T> & A & B> int countGraterThan(T[] numbers, T number) {
        int count = 0;
        for (T n : numbers) {
            if (n.compareTo(number) > 0) count++;
        }
        return count;
    }
}
