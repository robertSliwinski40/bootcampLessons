package DataStructures;
import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {

        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        colors[2] = "white";
        colors[3] = "yellow";
        colors[4] = "black";

        String[] color2 = {"blue", "yellow"};
        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(color2));
        System.out.println(colors[1]);

        System.out.println("Methods to loop through arrays");
        System.out.println("1");
        for (int i = 0; i < colors.length; i++) {
            System.out.println("Loop for, element " + i + ", and this is color: " + colors[i]);
        }
        System.out.println("2");
        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println("Loop for, element " + i + ", and this is color: " + colors[i]);
        }
        System.out.println("3");
        for (String a : colors) {
            System.out.println(a);
        }

        System.out.println("4");
        Arrays.stream(colors).forEach(System.out::println);

    }
}
