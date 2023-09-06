package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class GettingStarted {
    public static void main(String[] args) {


        Person anna = new Person("anna", 25, 'f');
        Person john = new Person("john", 16, 'm');
        Person patty = new Person("patty", 17, 'f');
        Person lola = new Person("lola", 12, 'f');
        Person lola1 = new Person("bola", 16, 'f');
        Person lola2 = new Person("cola", 5, 'f');
        Person lola3 = new Person("pol", 14, 'f');
        Person lola4 = new Person("lol", 8, 'f');
        Person lola5 = new Person("col", 31, 'f');
        Person lola6 = new Person("dola", 67, 'f');
        Person lola7 = new Person("samantha", 64, 'f');
        Person lola8 = new Person("baby", 1, 'f');
        int legalAge = 18;

        List<Person> people = new ArrayList<>();
        people.add(anna);
        people.add(john);
        people.add(patty);
        people.add(lola);
        people.add(lola1);
        people.add(lola2);
        people.add(lola3);
        people.add(lola4);
        people.add(lola5);
        people.add(lola6);
        people.add(lola7);
        people.add(lola8);


        people.stream().filter(person -> person.getAge() < legalAge).filter(person -> person.getSex() == 'f').forEach(System.out::println);
        System.out.println();

        List<Person> youngPeople = people.stream().
                filter(p -> p.getAge() <= legalAge).limit(10).collect(Collectors.toList());
        System.out.println(youngPeople);

    }


    public static class Person {
        String name;
        int age;
        char sex;

        public Person(String name, int age, char sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public char getSex() {
            return sex;
        }

        public void setSex(char sex) {
            this.sex = sex;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex=" + sex +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && sex == person.sex && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, sex);
        }
    }
}
