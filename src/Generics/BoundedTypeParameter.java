package Generics;
/*
IMPORTANT senior level
many bounds
 */

public class BoundedTypeParameter {
    public static void main(String[] args) {

        Integer[] num = {4, 5, 6, 7, 8, 9, 10};
        System.out.println(countGraterThan(num, 7));

        Double[] num2 = {3.0, 4.0, 6.0, 7.0, 8.0};
        System.out.println(countGraterThan(num2, 6.5));

    }

    static <T extends Comparable<T>> int countGraterThan(T[] numbers, T number) {
        int count = 0;
        for (T n : numbers) {
            if (n.compareTo(number) > 0) count++;
        }
        return count;
    }
}
