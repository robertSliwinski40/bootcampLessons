package DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
Map contains key - value pairs
A map cannot contain duplicate keys, otherwise will override values
HashTable - for multithreading, null not allowed
HashMap - null allowed, most common map
SortedMap

*important hashcode - ALWAYS override
so Map change key to hashcode and search the value

//fn+ctrl+space, now shift+control+space
//cmd+n
 */
public class WorkingWithMaps {
    public static void main(String[] args) {

        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Mark"));
        map.put(3, new Person("Kate"));
        map.put(4, new Person("Paul"));
        map.put(5, new Person("Rob"));
        map.put(6, new Person("Rob"));
        map.put(1, new Person("Alex2"));            //it will override
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(3));
        System.out.println(map.containsKey(7));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.remove(4);

        System.out.println("\nlooping");
        map.entrySet().forEach(x -> System.out.println(x.getKey()+" "+x.getValue()));

        System.out.println("\nlooping");
        map.forEach((integer, person) ->{               //*fn+ctrl+space map.foreach(*), now shift+control+space
            System.out.println(integer+"-"+person);
        } );

        System.out.println();
        System.out.println(map.get(4));
        System.out.println(map.getOrDefault(4,new Person("default")));
        System.out.println(map.values());
        System.out.println("////////Override the hashcode/////////////////////");

        Map<Person, Diamond> map2 = new HashMap<>();
        map2.put(new Person("Jamila"),new Diamond("African Diamond"));
        System.out.println(map2.get(new Person("Jamila")));

        System.out.println(new Person("Jamila").hashCode());   //so Map change key to hashcode and search the value
        System.out.println(new Person("Jamila").hashCode());





    }

    static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    record Diamond (String name){}
}
