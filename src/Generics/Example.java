package Generics;
/*
Sometimes we need generics to help us enforce the type on this list (*)
thus

we do that: List<Integer> or List<String> to enforce a proper type of data inside list
remove the risk of class casting exception
 */
import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List numbers = new ArrayList();

       /* Generic type - force type into list

        List<String> num1 = new ArrayList<>();
        List<Integer> num2 = new ArrayList<>();

        */
        numbers.add(1);                 //(*) type int
        numbers.add("2");               //(*) type String

        //looping
        for (Object number: numbers) {
            System.out.println((Integer) number); //error
            System.out.println((String) number); //error
        }

    }
}
