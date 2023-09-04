package Generics;

public class GenericsAndClasses {
    public static void main(String[] args) {
        Box <Phone>box = new Box();
        box.set(new Phone("Motorola"));
        System.out.println(box.getT());

        Box <Letter>box2 = new Box();
        box2.set(new Letter("wife"));
        System.out.println(box2.getT());
    }
}
