package Generics;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Date;

/*
? Wildcards
? mean unknown type
Unbounded <?>
UpperUnbounded Wildcards mean we can restrict, for instance, to deal only with numbers

 */
public class UpperBoundedWildcards {
    public static void main(String[] args) {

        List<Object> list1 = Arrays.asList(1, "ala", 3.0, 'A',new Date());
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        List<Double> list3 = Arrays.asList(1.5, 2.5, 5.5);
        List<String> list4 = Arrays.asList("john", "2.5", "Z", "Terminator");
        List<Number> list5 = Arrays.asList(1,2.4,34);
        List<BigDecimal> list6 = Arrays.asList(new BigDecimal("25"),BigDecimal.TEN,BigDecimal.ZERO);

        //print(list1);
        printNumbers(list2);
        printNumbers(list3);
        // print(list4);
         printNumbers(list5);
         printNumbers(list6);

    }
                            // List<?> list Unbounded Wildcard
                            //UpperBounder (List <? extends Number> list) means Number class and its children class
    static void printNumbers(List <? extends Number> list) {
        list.forEach(o -> {
            System.out.print(o.getClass().getName());
            System.out.println(" - "+o);
        });
    }
}
