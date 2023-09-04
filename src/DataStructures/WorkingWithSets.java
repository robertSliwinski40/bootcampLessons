package DataStructures;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
No duplicates, no order, override equals()
TreeSet preserves order
!!!HashSet - in order to use Sets correctly, you need to override equals and hashcode methods.
Because without that, it compares the value in memory so whether they are pointing to the same object.
What we want is to compare the actual fields and properties within it

 */
public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));

        System.out.println(balls.size());
        balls.forEach(System.out::println);
        balls.remove(new Ball("red"));
        System.out.println(balls.size());
        balls.forEach(System.out::println);

    }

    //record Ball(String color) { }
    static class Ball {
        String color;

        public Ball(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }
}
