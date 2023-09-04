package DataStructures;
/*
add, delete, retrieve at a particular point
Allows duplicates, not fixed in size like arrays, fast for data retrievals, various implementations (ArrayList, Stack, Vector, others)

!!! write List colors, import class, write new and press shirt+control+space

use List - new ArrayList or LinkedList, use interface List
ArrayList will be using 90 percent of the time because memory is not a concern
 */

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {

        List someList = new ArrayList();
        someList.add("blue");
        someList.add(1);
        someList.add('z');
        someList.add(new Object());

        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("black");
        colors.add("green");
        colors.add("brown");

        System.out.println(someList);
        System.out.println(colors);
        System.out.println("size of list is: "+colors.size());
        System.out.println(colors.contains("pink"));

        System.out.println("1");
        for (String a : colors) {
            System.out.println(a);
        }

        System.out.println("2");
        colors.forEach(System.out::println);

        System.out.println("3");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        //immutable list - cannot add
        List<String> colorsUnmodifiable = List.of("pink","grey","violet");
        //colorsUnmodifiable.add("green");          //ERROR




    }

}
