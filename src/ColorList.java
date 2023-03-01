import java.util.ArrayList;
import java.util.List;

public class ColorList {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("red");
        colors.add("purple");
        colors.add("green");
        colors.add("yellow");
        colors.add("aqua");
        colors.add("brown");

        System.out.println(colors);
        System.out.println();
        colors.forEach(c-> System.out.print(c+" "));

    }
}