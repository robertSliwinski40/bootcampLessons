package Generics;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/*
Wildcards can have only 1 bound!!!!!!!!
? Wildcards
? mean unknown type
Unbounded <?>
UpperUnbounded Wildcards mean we can restrict, for instance, to deal only with numbers

 */
public class LowerBoundedWildcards {
    public static void main(String[] args) {

        List<Object> list1a = Arrays.asList(1, "ala", 3.0, 'A',new Date(),4);
        List<Integer> list2a = Arrays.asList(1, 2, 3,4,5);
        List<Double> list3a = Arrays.asList(1.5, 2.5, 7.5);
        //List<String> list4a = Arrays.asList("john", "2.5", "Z", "Terminator");
        List<Number> listaNr6 = Arrays.asList(1,2.4,34);
        List<BigDecimal> list6a = Arrays.asList(new BigDecimal("25"),BigDecimal.TEN,BigDecimal.ZERO);

        printNumbers(list1a);
        printNumbers(list2a);
        //printNumbers(list3a);
         //printNumbers(list4a);
        printNumbers(listaNr6);
         //printNumbers(list6a);

    }
                            // List<?> list Unbounded Wildcard
                            //LowerBounder means child class and its parents class as well - Number and its super class
    static void printNumbers(List <? super Integer> list) {
        list.forEach(o -> {
            System.out.print(o.getClass().getName());
            System.out.println(" - "+o);
        });
    }
}
