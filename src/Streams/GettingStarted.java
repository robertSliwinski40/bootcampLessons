package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GettingStarted {
    public static void main(String[] args) {


        Person anna = new Person("anna", 25, 'f');
        Person john = new Person("john", 16, 'm');
        Person patty = new Person("patty", 17, 'f');
        Person lola = new Person("lola", 30, 'f');
        int legalAge = 18;

        List<Person> people = new ArrayList<>();
        people.add(anna);
        people.add(john);
        people.add(patty);
        people.add(lola);


        people.stream().filter(person -> person.getAge() < legalAge).filter(person -> person.getSex() == 'f').forEach(System.out::println);

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
